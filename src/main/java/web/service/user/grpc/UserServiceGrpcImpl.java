package web.service.user.grpc;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import web.service.user.grpc.*;
import web.service.user.service.RegistrationService;
import web.service.user.service.UserService;


@GRpcService
public class UserServiceGrpcImpl extends UserServiceGrpc.UserServiceImplBase {

    private final UserService userService;

    @Autowired
    public UserServiceGrpcImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void registration(RegistrationRequestGrpc request,
                             StreamObserver<RegistrationResponseGrpc> responseObserver) {
        responseObserver.onNext(userService.registerNewAccount(request));
        responseObserver.onCompleted();
    }

    @Override
    public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
        responseObserver.onNext(userService.authenticateUser(request));
        responseObserver.onCompleted();
    }

    @Override
    public void verificationTokenRegistration(ConfirmEmailRequest request,
                                              StreamObserver<ConfirmEmailResponse> responseObserver) {
        responseObserver.onNext(userService.verifyingEmail(request));
        responseObserver.onCompleted();
    }

    @Override
    public void passwordForgot(PasswordResetRequest request,
                               StreamObserver<PasswordResetResponse> responseObserver) {
        responseObserver.onNext(userService.sendingResetPasswordEmail(request));
        responseObserver.onCompleted();
    }

    @Override
    public void registrationInformation(RegistrationInformationRequest request,
                                        StreamObserver<RegistrationInformationResponse> responseObserver) {
        responseObserver.onNext(userService.registerInformation(request));
        responseObserver.onCompleted();
    }

    @Override
    public void passwordReset(NewPasswordRequest request,
                              StreamObserver<NewPasswordResponse> responseObserver) {
        responseObserver.onNext(userService.setNewPassword(request));
        responseObserver.onCompleted();
    }

    @Override
    public void verificationResetPasswordToken(VerificationResetPasswordTokenRequest request,
                                               StreamObserver<VerificationResetPasswordTokenResponse> responseObserver) {
        responseObserver.onNext(userService.verifyResetPasswordToken(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getEmailFromToken(GetEmailRequest request,
                                  StreamObserver<GetEmailResponse> responseObserver) {
        responseObserver.onNext(userService.getEmailFromToken(request));
        responseObserver.onCompleted();
    }

    @Override
    public void validateToken(ValidateTokenRequest request,
                              StreamObserver<ValidateTokenResponse> responseObserver) {
        responseObserver.onNext(userService.validateToken(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getAllUser(GetAllUserRequest request, StreamObserver<GetAllUserResponse> responseObserver) {
        responseObserver.onNext(userService.getAllUser(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getUser(GetUserRequest request, StreamObserver<GetUserResponse> responseObserver) {
        responseObserver.onNext(userService.getUserById(request));
        responseObserver.onCompleted();
    }

    @Override
    public void renameUser(ChangeUserNameRpcRequest request, StreamObserver<ChangeUserNameRpcResponse> responseObserver) {
        responseObserver.onNext(userService.changeUserName(request));
        responseObserver.onCompleted();
    }

    @Override
    public void saveAvatar(SaveUserAvatarRequest request, StreamObserver<SaveUserAvatarResponse> responseObserver) {
        responseObserver.onNext(userService.saveUserAvatar(request));
        responseObserver.onCompleted();
    }
}
