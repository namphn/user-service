package web.service.user.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.service.user.model.User;
import web.service.user.model.request.RegistrationInformationRequest;
import web.service.user.model.request.RegistrationRequest;
import web.service.user.service.RegistrationService;
import web.service.user.service.UserDetailServiceCustom;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class RegistrationNewAccountController {

    private final RegistrationService registrationService;
    private final UserDetailServiceCustom userDetailServiceCustom;

    public RegistrationNewAccountController(RegistrationService registrationService, UserDetailServiceCustom userDetailServiceCustom) {
        this.registrationService = registrationService;
        this.userDetailServiceCustom = userDetailServiceCustom;
    }

    @PostMapping("/registration-email")
    public String registerEmail(@Valid @RequestBody RegistrationRequest request){
        if(registrationService.checkForExistingAccount(request.getEmail())){
            return "have existing account";
        }
        registrationService.createNewAccount(request.getEmail(), request.getPassword());
        return " Created new account nonactive";
    }

    @PostMapping("/register-information")
    public String registerInformationAccount(@Valid @RequestBody RegistrationInformationRequest request){
        User user = userDetailServiceCustom.findUserByEmail(request.getEmail());
        user.setUserName(request.getUserName());
        user.setPhone(request.getPhone());
        userDetailServiceCustom.saveUser(user);
        return "saved Information";
    }
}
