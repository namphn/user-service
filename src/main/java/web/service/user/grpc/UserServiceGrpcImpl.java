package web.service.user.grpc;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import web.service.grpc.*;
import web.service.user.service.JwtTokenProvider;
import web.service.user.service.RegistrationService;
import web.service.user.service.UserDetailServiceCustom;
import web.service.user.service.UserService;


@GRpcService
public class UserServiceGrpcImpl extends UserServiceGrpc.UserServiceImplBase {

    private final UserService userService;

    @Autowired
    public UserServiceGrpcImpl(UserService userService, RegistrationService registrationService) {
        this.userService = userService;
    }

    @Override
    public void registration(RegistrationRequestGrpc request, StreamObserver<RegistrationResponseGrpc> responseObserver) {
        responseObserver.onNext(userService.registerNewAccount(request));
        responseObserver.onCompleted();
    }

    @Override
    public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
        responseObserver.onNext(userService.authenticateUser(request));
        responseObserver.onCompleted();
    }

    @Override
    public void verificationTokenRegistration(ConfirmEmailRequest request, StreamObserver<ConfirmEmailResponse> responseObserver) {
        responseObserver.onNext(userService.sendingTokenToVerifyEmail(request));
        responseObserver.onCompleted();
    }

    @Override
    public void passwordForgot(PasswordResetRequest request, StreamObserver<PasswordResetResponse> responseObserver) {
        super.passwordForgot(request, responseObserver);
    }

    @Override
    public void registrationInformation(RegistrationInformationRequest request, StreamObserver<RegistrationInformationResponse> responseObserver) {
        super.registrationInformation(request, responseObserver);
    }
}
