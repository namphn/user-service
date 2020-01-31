package web.service.user.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import web.service.user.model.Role;
import web.service.user.repository.RoleRepository;
import web.service.user.repository.UserRepository;

public class DataSeedingListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // add ADMIN role and Members role
        if(roleRepository.findByName("ROLE_ADMIN") == null){
            roleRepository.save(new Role("ROLE_ADMIN"));
        }

        if(roleRepository.findByName("ROLE_ADMIN") == null){
            roleRepository.save(new Role("ROLE_MEMBER"));
        }
    }
}
