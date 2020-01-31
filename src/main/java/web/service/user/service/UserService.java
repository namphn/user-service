package web.service.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import web.service.user.model.User;
import web.service.user.model.UserDetailCustom;
import web.service.user.repository.UserRepositoryCustom;

@Service
public class UserService implements UserDetailsService {

    private final UserRepositoryCustom userRepositoryCustom;

    public UserService(UserRepositoryCustom userRepositoryCustom) {
        this.userRepositoryCustom = userRepositoryCustom;
    }

    public UserService() {
        this.userRepositoryCustom = new UserRepositoryCustom();
    }

    @Override
    public UserDetails loadUserByUsername(String userEmai) throws UsernameNotFoundException {

        User user = userRepositoryCustom.findByEmail(userEmai);
        if(user == null) {
            throw new UsernameNotFoundException(userEmai);
        }
        return new UserDetailCustom(user);
    }
    @Bean
    public UserService getUserService(){
        return new UserService();
    }
}
