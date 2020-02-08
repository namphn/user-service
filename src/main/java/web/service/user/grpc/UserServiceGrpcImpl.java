package web.service.user.grpc;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import web.service.grpc.*;
import web.service.user.service.JwtTokenProvider;
import web.service.user.service.UserDetailServiceCustom;
import web.service.user.service.UserService;


@GRpcService
public class UserServiceGrpcImpl extends UserServiceGrpc.UserServiceImplBase {

    private final AuthenticationManager authenticationManager;
    private final UserDetailServiceCustom userDetailServiceCustom;
    private final JwtTokenProvider jwtTokenProvider;
    private final UserService userService;

    @Autowired
    public UserServiceGrpcImpl(AuthenticationManager authenticationManager, UserDetailServiceCustom userService, JwtTokenProvider jwtTokenProvider, UserService userService1) {
        this.authenticationManager = authenticationManager;
        this.userDetailServiceCustom = userService;
        this.jwtTokenProvider = jwtTokenProvider;
        this.userService = userService1;
    }

    @Override
    public void createUser(CreateUserRequest request, StreamObserver<CreateUserResponse> responseObserver) {
        super.createUser(request, responseObserver);
    }

    @Override
    public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
        responseObserver.onNext(userService.authenticateUser(request));
        responseObserver.onCompleted();
    }

    @Override
    public void verificationTokenRegistration(ConfirmEmailRequest request, StreamObserver<ConfirmEmailResponse> responseObserver) {
        super.verificationTokenRegistration(request, responseObserver);
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
