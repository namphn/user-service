package web.service.user.service;

import org.springframework.stereotype.Service;
import web.service.user.model.PasswordResetToken;
import web.service.user.model.User;
import web.service.user.repository.PasswordResetTokenRepository;
import web.service.user.repository.UserRepository;

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
        passwordResetToken.setUser(forgotPasswordUser);
        passwordResetTokenRepository.save(passwordResetToken);
        return passwordResetToken;
    }
    public User findUserByPasswordResetToken(String token){
        PasswordResetToken passwordResetToken = passwordResetTokenRepository.findByToken(token);
        if(passwordResetToken == null) return null;
        else
            return passwordResetToken.getUser();
    }
}
