package web.service.user.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import web.service.user.model.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
    User findByEmail(String email);
    Optional<User> findById(String id);
    Page<User> getAllByEnableTrue(Pageable pageable);
    List<User> findAll();
    User deleteByEmail(String email);
}
