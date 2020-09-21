package web.service.user.service;

import org.springframework.stereotype.Service;
import web.service.user.model.User;
import web.service.user.repository.UserRepository;

@Service
public class RegistrationService {

    private final UserRepository userRepository;

    public RegistrationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean checkForExistingAccount(String email){
        User user = userRepository.findByEmail(email);
        if(user != null && user.isEnable()) {
            return true;
        }
        else return false;
    }

    public void createNewAccount(String email, String password, String name){
        User user = new User(email, password, name);
        user.setEnable(false);
        userRepository.save(user);
    }
    public void saveInformation(String email, String phone){
        User user = userRepository.findByEmail(email);
        userRepository.save(user);
    }

    public void createNewVerifyToken(String email, String password, String name) {
        User user = userRepository.findByEmail(email);
        user.setPassword(password);
        user.setName(name);

    }
}
