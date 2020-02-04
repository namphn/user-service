package web.service.user.Controller;

import com.google.api.Http;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.BootstrapWith;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import web.service.user.model.*;
import web.service.user.service.*;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Locale;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    private UserService userService;

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @Autowired
    private VerificationTokenRegistrationService verificationService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity authenticateUser(@Valid @RequestBody LoginRequest loginRequest) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    loginRequest.getEmail(),
                    loginRequest.getPassword()
            ));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        } catch (NullPointerException e){
            throw new Exception("NULL", e);
        }
        final UserDetailCustom userDetails = userService.loadUserByUsername(loginRequest.getEmail());
        final String token = jwtTokenProvider.generateToken(userDetails);
        return ResponseEntity.ok(new LoginResponse(token));
    }

    @RequestMapping("/ok")
    public String res(){
        return "hello";
    }


//    @GetMapping("/registrationConfirm")
//    public String confirmRegistration
//            (WebRequest request, Model model, @RequestParam("token") String token){
//
//        Locale locale = request.getLocale();
//
//        VerificationToken verificationToken = registrationAccountService.getVerificationToken(token);
//        if (verificationToken == null) {
//            String message = "auth.message.invalidToken" + locale;
//            model.addAttribute("message", message);
//            return "redirect:/badUser.html?lang=" + locale.getLanguage();
//        }
//        User user = verificationToken.getUser();
//        Calendar cal = Calendar.getInstance();
//        if ((verificationToken.getExpiryDate().get - cal.getTime().getTime()) <= 0) {
//            String messageValue = "auth.message.expired" + locale;
//            model.addAttribute("message", messageValue);
//            return "redirect:/badUser.html?lang=" + locale.getLanguage();
//        }
//
//        user.setEnable(true);
//        registrationAccountService.saveRegisteredUser(user);
//        return "redirect:/login.html?lang=" + request.getLocale().getLanguage();
//    }

    @PostMapping("/verification")
    public String verifyEmail(@Valid @RequestBody LoginRequest loginRequest){
       System.out.println("sddasd");
       verificationService.createVerification(loginRequest.getEmail());
       return "verifying email";
    }
    @GetMapping("/verify-email")
    @ResponseBody
    public String verifyEmail(String code) {
        return verificationService.verifyEmail(code).getBody();
    }
}
