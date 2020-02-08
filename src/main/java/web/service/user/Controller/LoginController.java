package web.service.user.Controller;

import io.grpc.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import web.service.grpc.LoginResponse;
import web.service.grpc.UserServiceGrpc;
import web.service.user.grpc.UserServiceGrpcImpl;
import web.service.user.model.request.LoginRequest;
import web.service.user.service.JwtTokenProvider;
import web.service.user.service.UserDetailServiceCustom;
import web.service.user.service.UserService;

import javax.validation.Valid;

@RestController
@RequestMapping("user")
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) throws Exception {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("0.0.0.0", 6565).build();
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        web.service.grpc.LoginRequest loginRequestGrpc = userService.convertToLoginRequestGprc(loginRequest);
        System.out.println(loginRequestGrpc.getEmail());
        LoginResponse response = stub.login(loginRequestGrpc);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
