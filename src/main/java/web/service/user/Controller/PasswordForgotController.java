package web.service.user.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import web.service.user.model.request.PasswordForgotRequest;
import web.service.user.model.request.PasswordResetToken;
import web.service.user.model.response.PasswordForgotResponse;
import web.service.user.service.GrpcClientService;
import web.service.user.service.PasswordForgotTokenService;
import web.service.user.service.SendingMailService;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping("/user/forgot-password")
public class PasswordForgotController {

    private final GrpcClientService grpcClientService;
    private final PasswordForgotTokenService passwordForgotTokenService;
    private final SendingMailService sendingMailService;

    public PasswordForgotController(GrpcClientService grpcClientService, PasswordForgotTokenService passwordForgotTokenService, SendingMailService sendingMailService) {
        this.grpcClientService = grpcClientService;
        this.passwordForgotTokenService = passwordForgotTokenService;
        this.sendingMailService = sendingMailService;
    }

    @PostMapping
    public ResponseEntity sendPasswordReset(@RequestBody @Valid PasswordForgotRequest passwordForgotRequest){
        PasswordForgotResponse response = grpcClientService.forgotPassword(passwordForgotRequest);
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
