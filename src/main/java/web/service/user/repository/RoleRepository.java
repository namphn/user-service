package web.service.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import web.service.user.model.Role;

public interface RoleRepository extends MongoRepository<Role, String>, QuerydslPredicate {
    Role findByName(String name);
}
