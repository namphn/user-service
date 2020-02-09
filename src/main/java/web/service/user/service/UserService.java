package web.service.user.service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;
import web.service.grpc.*;
import web.service.user.model.UserDetailCustom;
import web.service.user.model.VerificationToken;
import web.service.user.model.request.RegistrationRequest;

@Service
public class UserService {

    private final AuthenticationManager authenticationManager;
    private final UserDetailServiceCustom userDetailServiceCustom;
    private final JwtTokenProvider jwtTokenProvider;
    private final RegistrationService registrationService;
    private final VerificationTokenRegistrationService verificationTokenRegistrationService;
    private final SendingMailService sendingMailService;

    public UserService(AuthenticationManager authenticationManager, UserDetailServiceCustom userDetailServiceCustom, JwtTokenProvider jwtTokenProvider, RegistrationService registrationService, VerificationTokenRegistrationService verificationTokenRegistrationService, SendingMailService sendingMailService) {
        this.authenticationManager = authenticationManager;
        this.userDetailServiceCustom = userDetailServiceCustom;
        this.jwtTokenProvider = jwtTokenProvider;
        this.registrationService = registrationService;
        this.verificationTokenRegistrationService = verificationTokenRegistrationService;
        this.sendingMailService = sendingMailService;
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

    public ConfirmEmailRequest convertToConfirmEmailReqest(RegistrationRequest request){
        ConfirmEmailRequest.Builder grpcRequest = ConfirmEmailRequest.newBuilder();
        grpcRequest.setEmail(request.getEmail());
        return grpcRequest.build();
    }

    public RegistrationResponseGrpc registerNewAccount(RegistrationRequestGrpc request){
        if(registrationService.checkForExistingAccount(request.getEmail())){
            return null;
        }
        registrationService.createNewAccount(request.getEmail(), request.getPassword());
        RegistrationResponseGrpc.Builder response = RegistrationResponseGrpc.newBuilder();
        response.setEmail(request.getEmail());
        response.setPassword(request.getPassword());
        return response.build();
    }
    public ConfirmEmailResponse sendingTokenToVerifyEmail(ConfirmEmailRequest request){
        VerificationToken verificationToken = null;
        verificationToken = verificationTokenRegistrationService.createVerification(request.getEmail());
        if(verificationToken == null){
            return null;
        }
        sendingMailService.sendVerificationMail(request.getEmail(),verificationToken.getToken());
        ConfirmEmailResponse.Builder response = ConfirmEmailResponse.newBuilder();
        response.setStatus("verifying email");
        return response.build();
    }
}
