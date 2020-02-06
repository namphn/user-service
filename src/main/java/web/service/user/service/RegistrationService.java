package web.service.user.service;

import org.springframework.beans.factory.annotation.Autowired;
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
        if(user != null) {
            return true;
        }
        else return false;
    }

    public void createNewAccount(String email, String password){
        User user = new User(email, password);
        user.setEnable(false);
        userRepository.save(user);
    }
}
