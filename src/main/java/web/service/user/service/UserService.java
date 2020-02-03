package web.service.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import web.service.user.model.User;
import web.service.user.model.UserDetailCustom;
import web.service.user.repository.UserRepository;
import web.service.user.repository.UserRepositoryCustom;

@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepositoryCustom;

    public UserService(UserRepositoryCustom userRepositoryCustom) {
        this.userRepositoryCustom = userRepositoryCustom;
    }

    public UserService() {
        this.userRepositoryCustom = new UserRepositoryCustom();
    }

    @Bean
    public UserService getUserService(){
        return new UserService();
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepositoryCustom.findByUserName(s);

        System.out.println(user);
        if(user == null) {
            throw new UsernameNotFoundException(s);
        }
        return new UserDetailCustom(user);
    }
    @Bean
    JwtAuthenticationFilter jwtAuthenticationFilterBean(){
        return new JwtAuthenticationFilter();
    }
}
