package web.service.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import web.service.user.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    public User findByUserName(String useName);
}
