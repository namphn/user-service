package web.service.user.Controller;

import io.grpc.StatusRuntimeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import web.service.grpc.LoginResponse;
import web.service.user.model.request.LoginRequest;
import web.service.user.service.GrpcClientService;

import javax.validation.Valid;

@RestController
@RequestMapping("user")
public class LoginController {

    private final GrpcClientService grpcClientService;

    public LoginController(GrpcClientService grpcClientService) {
        this.grpcClientService = grpcClientService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) throws Exception {
        LoginResponse response = null;
        try{
            response =  grpcClientService.login(loginRequest);
        } catch (StatusRuntimeException e) {
            System.out.println(e);
        }

        return new ResponseEntity<>(new web.service.user.model.response.LoginResponse(response.getToken()), HttpStatus.OK);
    }
}
