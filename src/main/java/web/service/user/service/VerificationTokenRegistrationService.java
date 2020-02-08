package web.service.user.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import web.service.user.model.User;
import web.service.user.model.VerificationToken;
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
        if(user == null){
            user = new User();
            user.setEmail(email);
            userRepository.save(user);
        }
        VerificationToken verificationToken = verificationTokenRepository.findByUserEmail(email);
        if(verificationToken == null){
            verificationToken = new VerificationToken();
            verificationToken.setUser(user);
            verificationTokenRepository.save(verificationToken);
        }

        return verificationToken;
    }

    public ResponseEntity<String> verifyEmail(String token){
        VerificationToken verificationToken = verificationTokenRepository.findByToken(token);
        if(verificationToken == null) {
            return ResponseEntity.badRequest().body("Invalid token");
        }

        if(verificationToken.getExpiryDateTime().isBefore(LocalDateTime.now())){
            return ResponseEntity.badRequest().body("Expired token");
        }

        /**
         * có nên lưu lại token đã confirm ?
         */

        verificationToken.setConfirmDateTime(LocalDateTime.now());
        verificationToken.setStatus(VerificationToken.STATUS_VERIFIED);
        verificationTokenRepository.save(verificationToken);
        return ResponseEntity.ok("You are successfully verify your email address");
    }
}
