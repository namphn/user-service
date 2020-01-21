package web.service.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import web.service.user.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>, QuerydslPredicateExecutor<User> {

    void insertUser(User user);

    void deleteById(String id);
}
