package web.service.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import web.service.user.model.User;
import web.service.user.model.UserDetailCustom;
import web.service.user.repository.UserRepository;

@Service
public class UserDetailServiceCustom implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailServiceCustom(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    JwtAuthenticationFilter jwtAuthenticationFilterBean(){
        return new JwtAuthenticationFilter();
    }

    @Override
    public UserDetailCustom loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(s);
        if(user == null) {
            throw new UsernameNotFoundException(s);
        }
        return new UserDetailCustom(user);
    }

    public UserDetailCustom loadUserByEmail(String email){
        User user = userRepository.findByEmail(email);
        if(user == null) {
            throw new UsernameNotFoundException(email);
        }
        return new UserDetailCustom(user);
    }

    public User findUserByEmail(String email){
        User user = userRepository.findByEmail(email);
        if(user == null) {
            throw new UsernameNotFoundException(email);
        }
        return user;
    }
    public void saveUser(User user){
        userRepository.save(user);
    }

}
