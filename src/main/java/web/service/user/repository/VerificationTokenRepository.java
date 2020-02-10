package web.service.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import web.service.user.model.User;
import web.service.user.model.VerificationToken;

import java.util.List;

public interface VerificationTokenRepository extends MongoRepository<VerificationToken, Long> {
    VerificationToken findByToken(String token);
    VerificationToken findByUserEmail(String email);
}
