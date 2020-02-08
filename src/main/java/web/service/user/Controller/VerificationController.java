package web.service.user.Controller;

import org.springframework.web.bind.annotation.*;
import web.service.user.model.*;
import web.service.user.model.request.LoginRequest;
import web.service.user.service.*;
import javax.validation.Valid;


@RestController
@RequestMapping("/user")
@CrossOrigin
public class VerificationController {

    private final VerificationTokenRegistrationService verificationService;
    private final SendingMailService sendingMailService;

    public VerificationController(VerificationTokenRegistrationService verificationService, SendingMailService sendingMailService) {
        this.verificationService = verificationService;
        this.sendingMailService = sendingMailService;
    }

    @RequestMapping("/ok")
    public String res(){
        return "hello";
    }

    @PostMapping("/verification")
    public String verifyEmail(@Valid @RequestBody LoginRequest loginRequest){
        VerificationToken verificationToken = verificationService.createVerification(loginRequest.getEmail());
        sendingMailService.sendVerificationMail(loginRequest.getEmail(), verificationToken.getToken());
       return "verifying email";
    }
    @GetMapping("/verify-email")
    @ResponseBody
    public String verifyEmail(String code) {
        return verificationService.verifyEmail(code).getBody();
    }
}
