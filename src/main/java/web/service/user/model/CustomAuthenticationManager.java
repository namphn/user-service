package web.service.user.model;

import com.sun.mail.imap.Rights;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import web.service.user.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class CustomAuthenticationManager implements AuthenticationManager {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getPrincipal() + "";
        String password = authentication.getPrincipal() + "";

        User user = userRepository.findByEmail(username);

        List<GranAuthorityImpl> granAuthorities = new ArrayList<>();
        granAuthorities.add(new GranAuthorityImpl("ROLE_USER"));
        return new UsernamePasswordAuthenticationToken(username, password,granAuthorities);
    }
}
