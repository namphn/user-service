package web.service.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import web.service.user.model.VerificationToken;

import java.util.List;

@Repository
public interface VerificationTokenRepository extends MongoRepository<VerificationToken, Long> {
    VerificationToken findByToken(String token);
    List<VerificationToken> findAllByUserIdOrderByIssuedDateTimeDesc(String userId);
}
