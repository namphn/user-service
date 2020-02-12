package web.service.user.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.service.user.model.request.RegistrationInformationRequest;
import web.service.user.model.request.RegistrationRequest;
import web.service.user.model.response.Error;
import web.service.user.model.response.RegistrationResponse;
import web.service.user.service.GrpcClientService;
import web.service.user.service.UserDetailServiceCustom;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class RegistrationNewAccountController {


    private final GrpcClientService grpcClientService;
    private final UserDetailServiceCustom userDetailServiceCustom;

    public RegistrationNewAccountController(GrpcClientService grpcClientService,
                                            UserDetailServiceCustom userDetailServiceCustom) {

        this.grpcClientService = grpcClientService;
        this.userDetailServiceCustom = userDetailServiceCustom;
    }

    @PostMapping("/register")
    public ResponseEntity register(@Valid @RequestBody RegistrationRequest  request){
        RegistrationResponse response = grpcClientService.registerNewAccount(request);
        if(response.getStatus() == "EXIST EMAIL") {
            return new ResponseEntity(Error.HAVE_EXIST_ACCOUNT,HttpStatus.BAD_REQUEST);
        } else if(response.getStatus() == "INVALID EMAIL"){
            return new ResponseEntity(Error.INVALID_EMAIL,HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @PostMapping("/register-information")
    public ResponseEntity registerInformationAccount(@Valid @RequestBody RegistrationInformationRequest request){
        String response = grpcClientService.registerInformation(request);
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
