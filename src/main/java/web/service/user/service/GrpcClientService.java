package web.service.user.service;

import io.grpc.ManagedChannel;
import org.springframework.stereotype.Service;
import web.service.grpc.*;
import web.service.user.model.request.LoginRequest;
import web.service.user.model.request.PasswordForgotRequest;
import web.service.user.model.request.RegistrationRequest;
import web.service.user.model.response.PasswordForgotResponse;
import web.service.user.model.response.RegistrationResponse;
import web.service.user.model.response.VerificationEmailResponse;
import web.service.user.model.response.VerificationResetPasswordResponse;

@Service
public class GrpcClientService {

    private final ManagedChannel channel;
    private final UserService userService;

    public GrpcClientService(ManagedChannel channel, UserService userService) {
        this.channel = channel;
        this.userService = userService;
    }

    public LoginResponse login(LoginRequest loginRequest){
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        web.service.grpc.LoginRequest loginRequestGrpc = userService.convertToLoginRequestGprc(loginRequest);
        LoginResponse response = stub.login(loginRequestGrpc);
        return response;
    }

    public RegistrationResponse registerNewAccount(RegistrationRequest request){
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        RegistrationRequestGrpc requestGrpc = userService.convertToRegistrationRequestGrpc(request);
        RegistrationResponse response = new RegistrationResponse(stub.registration(requestGrpc));
        return response;
    }

    public PasswordForgotResponse forgotPassword(PasswordForgotRequest request){
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        PasswordResetRequest grpcRequest = userService.convertToPasswordResetRequest(request);
        PasswordForgotResponse response = new PasswordForgotResponse(stub.passwordForgot(grpcRequest));
        return response;
    }

    public VerificationEmailResponse verifyingEmail(String token){
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        ConfirmEmailRequest.Builder request = ConfirmEmailRequest.newBuilder();
        request.setToken(token);
        ConfirmEmailResponse response = stub.verificationTokenRegistration(request.build());
        return new VerificationEmailResponse(response);
    }

    public VerificationResetPasswordResponse verifyingResetPasswordToken(String token){
        VerificationResetPasswordTokenRequest request
                = userService.setVerificationPassTokenRequest(token);
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        VerificationResetPasswordTokenResponse grpcResponse = stub.verificationResetPasswordToken(request);
        VerificationResetPasswordResponse response = new VerificationResetPasswordResponse(grpcResponse);
        return response;
    }

}
