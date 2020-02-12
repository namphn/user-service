package web.service.user.Controller;

import io.grpc.StatusRuntimeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import web.service.user.model.request.LoginRequest;
import web.service.user.model.response.LoginResponse;
import web.service.user.model.response.Status;
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
        if(response.getStatus().equals(Status.HAVE_NOT_ACCOUNT)){
            return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
