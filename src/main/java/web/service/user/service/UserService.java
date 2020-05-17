package web.service.user.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;
import web.service.grpc.user.*;
import web.service.user.model.User;
import web.service.user.model.UserDetailCustom;
import web.service.user.model.VerificationToken;
import web.service.user.model.PasswordResetToken;
import web.service.user.model.Status;
import web.service.user.repository.UserRepository;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class UserService {

    private static int MAX_PAGABLE_USER = 50;

    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final JwtTokenProvider jwtTokenProvider;
    private final RegistrationService registrationService;
    private final VerificationTokenRegistrationService verificationTokenRegistrationService;
    private final SendingMailService sendingMailService;
    private final PasswordForgotTokenService passwordForgotTokenService;

    public UserService(AuthenticationManager authenticationManager,
                       UserRepository userRepository,
                       JwtTokenProvider jwtTokenProvider,
                       RegistrationService registrationService,
                       VerificationTokenRegistrationService verificationTokenRegistrationService,
                       SendingMailService sendingMailService,
                       PasswordForgotTokenService passwordForgotTokenService) {

        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.jwtTokenProvider = jwtTokenProvider;
        this.registrationService = registrationService;
        this.verificationTokenRegistrationService = verificationTokenRegistrationService;
        this.sendingMailService = sendingMailService;
        this.passwordForgotTokenService = passwordForgotTokenService;
    }

    public LoginResponse authenticateUser(LoginRequest loginRequest){

        LoginResponse.Builder response = LoginResponse.newBuilder();
        final UserDetailCustom userDetails = loadUserByEmail(loginRequest.getEmail());
        
        if(userDetails == null
                || !loginRequest.getPassword().equals(userDetails.getPassword())){

            response.setStatus(Status.HAVE_NOT_ACCOUNT);

        } else {

            String username = userDetails.getUsername();

            if(userDetails.getUser().isEnable()){
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                        loginRequest.getEmail(),
                        loginRequest.getPassword()
                ));

                final String token = jwtTokenProvider.generateToken(userDetails);
                response.setStatus(Status.ACCEPT);

                response.setUsername(username);
                response.setToken(token);
                response.setUserId(userDetails.getUser().getId());
            } else
                response.setStatus(Status.ACCOUNT_IS_INACTIVE);
        }

        return response.build();
    }

    public RegistrationResponseGrpc registerNewAccount(RegistrationRequestGrpc request){
        RegistrationResponseGrpc.Builder response = RegistrationResponseGrpc.newBuilder();
        response.setEmail(request.getEmail());

        if(registrationService.checkForExistingAccount(request.getEmail())){
            response.setStatus(Status.EMAIL_ALREADY_EXISTS);
        } else {
            User user = userRepository.findByEmail(request.getEmail());
            if(user != null ) {
                registrationService.createNewVerifyToken(request.getEmail(),
                                                         request.getPassword(),
                                                         request.getFirstName(),
                                                         request.getLastName(),
                                                         request.getSex());
            }  else {
                registrationService.createNewAccount(request.getEmail(),
                        request.getPassword(),
                        request.getFirstName(),
                        request.getLastName(),
                        request.getSex());
            }

            if(!sendingTokenToVerifyEmail(request.getEmail())) {
                response.setStatus(Status.INVALID_EMAIL);
            } else {
                response.setStatus(Status.SENT_EMAIL);
            }
        }

        return response.build();
    }
    public boolean sendingTokenToVerifyEmail(String email){
        VerificationToken verificationToken = null;
        verificationToken = verificationTokenRegistrationService.createVerification(email);
        if(verificationToken == null){
            return false;
        }
        sendingMailService.sendVerificationMail(email,verificationToken.getToken());
        return true;
    }

    public PasswordResetResponse sendingResetPasswordEmail(PasswordResetRequest request){

        PasswordResetResponse.Builder response = PasswordResetResponse.newBuilder();
        response.setEmail(request.getEmail());

        PasswordResetToken passwordResetToken = passwordForgotTokenService.createPasswordToken(request.getEmail());
       if(passwordResetToken == null){
           response.setStatus(Status.HAVE_NOT_ACCOUNT);
       } else {
           String url = "localhost:8084/user";
           if(sendingMailService.sendPasswordResetMail(request.getEmail(),passwordResetToken.getToken(), url)){
               response.setStatus(Status.SENT_EMAIL);
           }
           else response.setStatus(Status.ERROR);
       }

        return response.build();
    }

    public ConfirmEmailResponse verifyingEmail(ConfirmEmailRequest request){
        ConfirmEmailResponse.Builder response = ConfirmEmailResponse.newBuilder();
        String verifyStatus = verificationTokenRegistrationService.verifyEmail(request.getToken());
        response.setStatus(verifyStatus);
        response.setEmail(verificationTokenRegistrationService
                .findUserByVerificationToken(request.getToken())
                .getEmail());

        return response.build();
    }

    public VerificationResetPasswordTokenResponse verifyResetPasswordToken(VerificationResetPasswordTokenRequest request){
        VerificationResetPasswordTokenResponse.Builder
                response = VerificationResetPasswordTokenResponse.newBuilder();
        User user = passwordForgotTokenService.findUserByPasswordResetToken(request.getToken());
        if(user == null){
            response.setStatus(Status.HAVE_NOT_ACCOUNT);
        } else  if (user.isEnable() == false) {
            response.setStatus(Status.ACCOUNT_IS_INACTIVE);
        } else {
                response.setEmail(user.getEmail());
                response.setStatus(Status.SUCCESSFULLY_VERIFY);
        }

        return response.build();
    }

    public NewPasswordResponse setNewPassword(NewPasswordRequest request){
        NewPasswordResponse.Builder response = NewPasswordResponse.newBuilder();
        User user = passwordForgotTokenService.findUserByPasswordResetToken(request.getToken());
        if(user == null) response.setStatus(Status.HAVE_NOT_ACCOUNT);
        else {
            if(request.getNewPassword().equals(request.getNewPasswordConfirm()) == false){
                response.setStatus(Status.INVALID_CONFIRM_PASSWORD);
            } else {
                saveNewPassword(user.getEmail(), request.getNewPassword());
                response.setEmail(user.getEmail());
                response.setStatus(Status.SAVED_NEW_PASSWORD);
            }
        }

        return response.build();
    }

    public void saveNewPassword(String email, String newPassword){
        User user = findUserByEmail(email);
        user.setPassword(newPassword);
        saveUser(user);
    }

    public RegistrationInformationResponse registerInformation(RegistrationInformationRequest request){
        User user = findUserByEmail(request.getEmail());
        registrationService.saveInformation(user.getEmail(), request.getPhone());
        RegistrationInformationResponse.Builder response = RegistrationInformationResponse.newBuilder();
        response.setStatus(Status.SAVED_INFORMATION);
        return response.build();
    }

    public GetEmailResponse getEmailFromToken(GetEmailRequest request){
        String email = null;
        GetEmailResponse.Builder response = GetEmailResponse.newBuilder();
        try {
            email = jwtTokenProvider.getEmailFromToken(request.getToken());
            response.setEmail(email);
        } catch (NoSuchAlgorithmException e) {
            response.setEmail(null);
        }
        return response.build();
    }

    public ValidateTokenResponse validateToken(ValidateTokenRequest request){
        ValidateTokenResponse.Builder response = ValidateTokenResponse.newBuilder();
        try {
            if(jwtTokenProvider.validateToken(request.getToken(), request.getEmail())){
                response.setStatus(true);
            }
        } catch (NoSuchAlgorithmException e) {
            response.setStatus(false);
        }
        return response.build();
    }

    public UserDetailCustom loadUserByEmail(String email){
        User user = userRepository.findByEmail(email);
        if(user == null) {
            return null;
        }
        return new UserDetailCustom(user);
    }

    public User findUserByEmail(String email){
        User user = userRepository.findByEmail(email);
        if(user == null) {
            return null;
        }
        return user;
    }
    public void saveUser(User user){
        userRepository.save(user);
    }

    public  GetAllUserResponse getAllUser(GetAllUserRequest request) {
        Pageable pageable = PageRequest.of(request.getPage(),this.MAX_PAGABLE_USER);
        Page<User> allUser =  userRepository.getAllByEnableTrue(pageable);

        web.service.user.model.Response.GetAllUserResponse getUser
                = new web.service.user.model.Response.GetAllUserResponse(allUser.getContent());

        ObjectMapper mapper = new ObjectMapper();
        GetAllUserResponse.Builder response = GetAllUserResponse.newBuilder();
        try {
            String json = mapper.writeValueAsString(getUser);

            JsonFormat.parser().ignoringUnknownFields().merge(json, response);

        } catch (JsonProcessingException | InvalidProtocolBufferException e) {
            return response.build();
        }
        return response.build();
    }
}
