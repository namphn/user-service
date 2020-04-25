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

    public void createNewAccount(String email, String password, String firstName, String lastName, boolean sex){
        User user = new User(email, password, firstName, lastName, sex);
        user.setEnable(false);
        userRepository.save(user);
    }
    public void saveInformation(String email, String phone){
        User user = userRepository.findByEmail(email);
        user.setPhone(phone);
        userRepository.save(user);
    }

    public void createNewVerifyToken(String email, String password, String firstName, String lastName, boolean sex) {
        User user = userRepository.findByEmail(email);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);

    }
}
