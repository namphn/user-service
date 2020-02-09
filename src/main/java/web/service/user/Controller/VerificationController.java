package web.service.user.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.service.grpc.ConfirmEmailResponse;
import web.service.user.model.request.LoginRequest;
import web.service.user.model.request.RegistrationRequest;
import web.service.user.model.response.RegistrationResponse;
import web.service.user.service.*;
import javax.validation.Valid;


@RestController
@RequestMapping("/user")
@CrossOrigin
public class VerificationController {

    private final VerificationTokenRegistrationService verificationService;
    private final SendingMailService sendingMailService;
    private final GrpcClientService grpcClientService;


    public VerificationController(VerificationTokenRegistrationService verificationService, SendingMailService sendingMailService, GrpcClientService grpcClientService, UserService userService) {
        this.verificationService = verificationService;
        this.sendingMailService = sendingMailService;
        this.grpcClientService = grpcClientService;
    }

    @RequestMapping("/ok")
    public String res(){
        return "hello";
    }

    @PostMapping("/verification")
    public ResponseEntity sendingEmailConfirm(@Valid @RequestBody RegistrationRequest request){
        ConfirmEmailResponse response = grpcClientService.sendingVerificationEmail(request);
        if(response == null) {
            return null;
        }
        return new ResponseEntity<>(new RegistrationResponse(response), HttpStatus.CREATED);
    }
    @GetMapping("/verify-email")
    @ResponseBody
    public String verifyEmail(String code) {
        return verificationService.verifyEmail(code).getBody();
    }
}
