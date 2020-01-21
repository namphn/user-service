package web.service.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.service.grpc.CreateUserRequest;
import web.service.user.model.User;
import web.service.user.repository.UserRepositoryCustom;

public class UserService {

    @Autowired
    private UserRepositoryCustom userRepositoryCustom;

    public void CreateUser(CreateUserRequest request){
        User user = new User(request.getUserName(),
                             request.getUserPassword(),
                             request.getUserEmail(),
                             request.getUserAddress(),
                             request.getUserPhoneNumber()
                );
        userRepositoryCustom.insert(user);
    }
}
