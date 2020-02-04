package web.service.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import web.service.user.model.User;
import web.service.user.model.VerificationToken;
import web.service.user.repository.UserRepository;
import web.service.user.repository.VerificationTokenRepository;
import java.time.LocalDateTime;


@Service
public class VerificationTokenRegistrationService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private VerificationTokenRepository verificationTokenRepository;
    @Autowired
    private SendingMailService sendingMailService;

    public void createVerification(String email){
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

        sendingMailService.sendVerificationMail(email,verificationToken.getToken());
    }

    public ResponseEntity<String> verifyEmail(String token){
        VerificationToken verificationToken = verificationTokenRepository.findByToken(token);
        if(verificationToken == null) {
            return ResponseEntity.badRequest().body("Invalid token");
        }

        if(verificationToken.getExpiryDateTime().isBefore(LocalDateTime.now())){
            return ResponseEntity.badRequest().body("Expired token");
        }

        verificationToken.setConfirmDateTime(LocalDateTime.now());
        verificationToken.setStatus(VerificationToken.STATUS_VERIFIED);
        verificationTokenRepository.save(verificationToken);

        return ResponseEntity.ok("You are successfully verify your email address");
    }
}
