package web.service.user.Controller;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import web.service.grpc.LoginRequest;
import web.service.grpc.LoginResponse;
import web.service.grpc.UserService;
import web.service.grpc.UserServiceGrpc;
import web.service.user.grpc.UserServiceGrpcImpl;
import web.service.user.service.JwtTokenProvider;
import web.service.user.service.UserDetailServiceCustom;
import javax.validation.Valid;

@RestController
@RequestMapping("user")
public class LoginController {

    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;
    private final UserDetailServiceCustom userDetailServiceCustom;
    private final UserServiceGrpcImpl userServiceGrpc;

    public LoginController(AuthenticationManager authenticationManager, JwtTokenProvider jwtTokenProvider, UserDetailServiceCustom userDetailServiceCustom, UserServiceGrpcImpl userServiceGrpc) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
        this.userDetailServiceCustom = userDetailServiceCustom;
        this.userServiceGrpc = userServiceGrpc;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) throws Exception {
//        try {
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
//                    loginRequest.getEmail(),
//                    loginRequest.getPassword()
//            ));
//        } catch (DisabledException e) {
//            throw new Exception("USER_DISABLED", e);
//        } catch (BadCredentialsException e) {
//            throw new Exception("INVALID_CREDENTIALS", e);
//        } catch (NullPointerException e){
//            throw new Exception("NULL", e);
//        }
//        final UserDetailCustom userDetails = userDetailServiceCustom.loadUserByEmail(loginRequest.getEmail());
//        final String token = jwtTokenProvider.generateToken(userDetails);
//        return ResponseEntity.ok(new LoginResponse(token));
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9095).usePlaintext().build();
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        LoginResponse response = stub.login(loginRequest);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
