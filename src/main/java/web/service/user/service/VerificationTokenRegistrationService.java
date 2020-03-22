package web.service.user.service;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.stereotype.Service;
import web.service.user.model.User;
import web.service.user.model.VerificationToken;
import web.service.user.model.Status;
import web.service.user.repository.UserRepository;
import web.service.user.repository.VerificationTokenRepository;
import java.time.LocalDateTime;


@Service
public class VerificationTokenRegistrationService {

    private final UserRepository userRepository;
    private final VerificationTokenRepository verificationTokenRepository;

    public VerificationTokenRegistrationService(UserRepository userRepository, VerificationTokenRepository verificationTokenRepository) {
        this.userRepository = userRepository;
        this.verificationTokenRepository = verificationTokenRepository;
    }

    public VerificationToken createVerification(String email){
        User user = userRepository.findByEmail(email);
        VerificationToken verificationToken = null;
        try{
            verificationToken = verificationTokenRepository.findByUserEmail(email);
        } catch (IncorrectResultSizeDataAccessException e){
            verificationToken = null;
        }

        if(verificationToken == null){
            verificationToken = new VerificationToken();
            verificationToken.setUser(user);
            verificationTokenRepository.save(verificationToken);
        }

        return verificationToken;
    }

    public String verifyEmail(String token){
        VerificationToken verificationToken = verificationTokenRepository.findByToken(token);
        if(verificationToken == null) {
            return Status.INVALID_TOKEN;
        }

        if(verificationToken.getExpiryDateTime().isBefore(LocalDateTime.now())){
            return Status.EXPIRED_TOKEN;
        }

        /**
         * có nên lưu lại token đã confirm ?
         */

        verificationToken.setConfirmDateTime(LocalDateTime.now());
        verificationToken.setStatus(VerificationToken.STATUS_VERIFIED);
        verificationTokenRepository.save(verificationToken);
        User user = userRepository.findByEmail(verificationToken.getUser().getEmail());
        user.setEnable(true);
        userRepository.save(user);
        return Status.SUCCESSFULLY_VERIFY;
    }

    public User findUserByVerificationToken(String token){
        VerificationToken verificationToken = verificationTokenRepository.findByToken(token);
        return verificationToken.getUser();
    }
}
