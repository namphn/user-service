package web.service.user.service;

import org.springframework.stereotype.Service;
import web.service.user.model.PasswordResetToken;
import web.service.user.model.Status;
import web.service.user.model.User;
import web.service.user.repository.PasswordResetTokenRepository;
import web.service.user.repository.UserRepository;

import java.util.Optional;

@Service
public class PasswordForgotTokenService {

    private final UserRepository userRepository;
    private final PasswordResetTokenRepository passwordResetTokenRepository;

    public PasswordForgotTokenService(UserRepository userRepository, PasswordResetTokenRepository passwordResetTokenRepository) {
        this.userRepository = userRepository;
        this.passwordResetTokenRepository = passwordResetTokenRepository;
    }

    public PasswordResetToken createPasswordToken(String email){
        User forgotPasswordUser = userRepository.findByEmail(email);
        if(forgotPasswordUser == null){
            return null;
        }
        PasswordResetToken passwordResetToken = new PasswordResetToken();
        passwordResetToken.setUserId(forgotPasswordUser.getId());
        passwordResetTokenRepository.save(passwordResetToken);
        return passwordResetToken;
    }
    public User findUserByPasswordResetToken(String token){
        PasswordResetToken passwordResetToken = passwordResetTokenRepository.findByToken(token);
        if (passwordResetToken != null) {
            Optional<User> optionalUser = userRepository.findById(passwordResetToken.getUserId());
            if (optionalUser.isPresent()) {
                return optionalUser.get();
            }
        }
        return null;
    }
}
