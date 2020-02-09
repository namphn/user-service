package web.service.user.service;

import io.grpc.ManagedChannel;
import org.springframework.stereotype.Service;
import web.service.grpc.ConfirmEmailRequest;
import web.service.grpc.ConfirmEmailResponse;
import web.service.grpc.LoginResponse;
import web.service.grpc.UserServiceGrpc;
import web.service.user.model.request.LoginRequest;
import web.service.user.model.request.RegistrationRequest;

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

    public ConfirmEmailResponse sendingVerificationEmail(RegistrationRequest request){
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        ConfirmEmailRequest grpcRequest = userService.convertToConfirmEmailReqest(request);
        return stub.verificationTokenRegistration(grpcRequest);
    }

}
