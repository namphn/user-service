package web.service.user.service;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.stereotype.Service;
import web.service.user.model.User;
import web.service.user.model.VerificationToken;
import web.service.user.model.Status;
import web.service.user.repository.UserRepository;
import web.service.user.repository.VerificationTokenRepository;
import java.time.LocalDateTime;
import java.util.Optional;


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

        if(!user.isEnable()){
            VerificationToken verificationToken = new VerificationToken();
            verificationToken.setUserId(user.getId());
            verificationTokenRepository.save(verificationToken);
            return verificationToken;
        }
        return null;
    }

    public String verifyEmail(String token){
        VerificationToken verificationToken = verificationTokenRepository.findByToken(token);
        if(verificationToken == null) {
            return Status.INVALID_TOKEN;
        }

        if(verificationToken.getExpiryDateTime().isBefore(LocalDateTime.now())){
            return Status.EXPIRED_TOKEN;
        }


        verificationToken.setConfirmDateTime(LocalDateTime.now());
        verificationToken.setStatus(VerificationToken.STATUS_VERIFIED);
        verificationTokenRepository.save(verificationToken);
        Optional<User> optionalUser = userRepository.findById(verificationToken.getUserId());
        if(optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setEnable(true);
            userRepository.save(user);
            return Status.SUCCESSFULLY_VERIFY;
        }
        return Status.INVALID_TOKEN;
    }

    public User findUserByVerificationToken(String token){
        VerificationToken verificationToken = null;
        try {
            verificationToken = verificationTokenRepository.findByToken(token);
            Optional<User> optionalUser = userRepository.findById(verificationToken.getUserId());
            if(optionalUser.isPresent()) {
                return optionalUser.get();
            } else return null;
        } catch (Exception exception) {
            return null;
        }
    }
}
