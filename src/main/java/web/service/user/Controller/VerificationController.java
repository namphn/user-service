package web.service.user.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.service.user.model.response.Status;
import web.service.user.model.response.VerificationEmailResponse;
import web.service.user.model.response.VerificationResetPasswordResponse;
import web.service.user.service.*;


@RestController
@RequestMapping("/user")
@CrossOrigin
public class VerificationController {

    private final GrpcClientService grpcClientService;

    public VerificationController(GrpcClientService grpcClientService) {
        this.grpcClientService = grpcClientService;
    }

    @RequestMapping("/ok")
    public String res(){
        return "hello";
    }


    @GetMapping("/verifying-email")
    @ResponseBody
    public ResponseEntity verifyEmail(@RequestParam("token") String token) {
        VerificationEmailResponse response = grpcClientService.verifyingEmail(token);
        if(response.getStatus().equals(Status.SUCCESSFULLY_VERIFY)){
            return new ResponseEntity(response, HttpStatus.OK);
        }
        return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/verifying-reset-password")
    public VerificationResetPasswordResponse verifyResetPasswordToken(@RequestParam("token") String token){
        return grpcClientService.verifyingResetPasswordToken(token);
    }
}
