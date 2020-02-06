package web.service.user.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import web.service.user.model.request.PasswordForgotRequest;
import web.service.user.model.request.PasswordResetToken;
import web.service.user.service.PasswordForgotTokenService;
import web.service.user.service.SendingMailService;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping("/user/forgot-password")
public class PasswordForgotController {

    private final PasswordForgotTokenService passwordForgotTokenService;
    private final SendingMailService sendingMailService;

    public PasswordForgotController(PasswordForgotTokenService passwordForgotTokenService, SendingMailService sendingMailService) {
        this.passwordForgotTokenService = passwordForgotTokenService;
        this.sendingMailService = sendingMailService;
    }

    @PostMapping
    public String sendPasswordReset(@RequestBody @Valid PasswordForgotRequest passwordForgotRequest,
                                    BindingResult bindingResult,
                                    HttpServletRequest request){
        PasswordResetToken passwordResetToken = passwordForgotTokenService.createPasswordToken(passwordForgotRequest.getEmail());
        if(passwordResetToken == null) {
            bindingResult.rejectValue("email",null , "we can not find an account for that email address");
            return "have not account";
        }
        String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
        sendingMailService.sendPasswordResetMail(passwordForgotRequest.getEmail(),passwordResetToken.getToken(), url);
        return "sending password reset email";
    }
}
