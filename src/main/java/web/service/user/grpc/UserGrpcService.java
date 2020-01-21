package web.service.user.grpc;

import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import web.service.grpc.CreateUserRequest;
import web.service.grpc.CreateUserResponse;
import web.service.grpc.UserService;
import web.service.grpc.UserServiceGrpc;

public class UserGrpcService extends UserServiceGrpc.UserServiceImplBase {

    @Override
    public void createUser(CreateUserRequest request, StreamObserver<CreateUserResponse> responseObserver) {
        CreateUserResponse response = CreateUserResponse.newBuilder().build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
