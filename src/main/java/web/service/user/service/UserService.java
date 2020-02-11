package web.service.user.service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;
import web.service.grpc.*;
import web.service.user.model.User;
import web.service.user.model.UserDetailCustom;
import web.service.user.model.VerificationToken;
import web.service.user.model.request.PasswordForgotRequest;
import web.service.user.model.PasswordResetToken;
import web.service.user.model.request.RegistrationRequest;
import web.service.user.model.response.Status;

@Service
public class UserService {

    private final AuthenticationManager authenticationManager;
    private final UserDetailServiceCustom userDetailServiceCustom;
    private final JwtTokenProvider jwtTokenProvider;
    private final RegistrationService registrationService;
    private final VerificationTokenRegistrationService verificationTokenRegistrationService;
    private final SendingMailService sendingMailService;
    private final PasswordForgotTokenService passwordForgotTokenService;

    public UserService(AuthenticationManager authenticationManager,
                       UserDetailServiceCustom userDetailServiceCustom,
                       JwtTokenProvider jwtTokenProvider,
                       RegistrationService registrationService,
                       VerificationTokenRegistrationService verificationTokenRegistrationService,
                       SendingMailService sendingMailService,
                       PasswordForgotTokenService passwordForgotTokenService) {

        this.authenticationManager = authenticationManager;
        this.userDetailServiceCustom = userDetailServiceCustom;
        this.jwtTokenProvider = jwtTokenProvider;
        this.registrationService = registrationService;
        this.verificationTokenRegistrationService = verificationTokenRegistrationService;
        this.sendingMailService = sendingMailService;
        this.passwordForgotTokenService = passwordForgotTokenService;
    }

    public LoginResponse authenticateUser(LoginRequest loginRequest){

            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    loginRequest.getEmail(),
                    loginRequest.getPassword()
            ));

        final UserDetailCustom userDetails = userDetailServiceCustom.loadUserByEmail(loginRequest.getEmail());
        final String token = jwtTokenProvider.generateToken(userDetails);
        LoginResponse.Builder response = LoginResponse.newBuilder();
        response.setStatus("jwt have created");
        response.setToken(token);
        return response.build();
    }

    public LoginRequest convertToLoginRequestGprc(web.service.user.model.request.LoginRequest request){
        LoginRequest.Builder grpcRequest = LoginRequest.newBuilder();
        grpcRequest.setEmail(request.getEmail());
        grpcRequest.setPassword(request.getPassword());
        return grpcRequest.build();
    }


    public RegistrationRequestGrpc convertToRegistrationRequestGrpc(RegistrationRequest request){
        RegistrationRequestGrpc.Builder grpcRequest = RegistrationRequestGrpc.newBuilder();
        grpcRequest.setEmail(request.getEmail());
        grpcRequest.setPassword(request.getPassword());
        return grpcRequest.build();
    }

    public PasswordResetRequest convertToPasswordResetRequest(PasswordForgotRequest request){
        PasswordResetRequest.Builder resetRequest = PasswordResetRequest.newBuilder();
        resetRequest.setEmail(request.getEmail());
        return resetRequest.build();
    }

    public VerificationResetPasswordTokenRequest setVerificationPassTokenRequest(String token){
        VerificationResetPasswordTokenRequest.Builder request = VerificationResetPasswordTokenRequest.newBuilder();
        request.setToken(token);
        return request.build();
    }

    public RegistrationResponseGrpc registerNewAccount(RegistrationRequestGrpc request){
        RegistrationResponseGrpc.Builder response = RegistrationResponseGrpc.newBuilder();
        response.setEmail(request.getEmail());
        response.setPassword(request.getPassword());

        if(registrationService.checkForExistingAccount(request.getEmail())){
            response.setStatus(Status.EMAIL_ALREADY_EXISTS);
        } else {
            if(!sendingTokenToVerifyEmail(request.getEmail())) {
                response.setStatus(Status.INVALID_EMAIL);
            } else {
                registrationService.createNewAccount(request.getEmail(), request.getPassword());
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
           String url = "localhost/user";
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
}
