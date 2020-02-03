package web.service.user.Controller;

import com.google.api.Http;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import web.service.user.model.GranAuthorityImpl;
import web.service.user.model.LoginRequest;
import web.service.user.model.LoginResponse;
import web.service.user.model.UserDetailCustom;
import web.service.user.service.JwtTokenProvider;
import web.service.user.service.UserService;

import javax.validation.Valid;
import java.util.Collection;

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

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity authenticateUser(@Valid @RequestBody LoginRequest loginRequest) throws Exception {
//        try {
//            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
//                    loginRequest.getUserName(),
//                    loginRequest.getPassword()
//            ));
//            if(authentication.isAuthenticated()) System.out.println("no");
//        } catch (DisabledException e) {
//            throw new Exception("USER_DISABLED", e);
//        } catch (BadCredentialsException e) {
//            throw new Exception("INVALID_CREDENTIALS", e);
//        } catch (NullPointerException e){
//            throw new Exception("NULL", e);
//        }
        final UserDetails userDetails = userService.loadUserByUsername(loginRequest.getUserName());
        final String token = jwtTokenProvider.generateToken(userDetails);
        return ResponseEntity.ok(new LoginResponse(token));
    }

    @RequestMapping("/ok")
    public String res(){
        return "hello";
    }
}
