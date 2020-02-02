package web.service.user.repository;

import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Predicate;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import web.service.user.config.MongoConfig;
import web.service.user.model.User;

import java.util.List;
import java.util.Optional;

@Data
@Repository
public class UserRepositoryCustom implements UserRepository {

    @Autowired
    MongoConfig mongoConfig;

    @Bean
    public UserRepository getUserRepository(){
        return new UserRepositoryCustom();
    }

    public void insertUser(User user) {
        MongoTemplate mongoTemplate = mongoConfig.mongoTemplate();
        mongoTemplate.insert(user);
    }

    public void deleteById(String id) {

    }

    public void delete(User entity) {

    }

    public void deleteAll(Iterable<? extends User> entities) {

    }

    public void deleteAll() {

    }

    public <S extends User> S save(S entity) {
        mongoConfig.mongoTemplate().save(entity);
        return entity;
    }

    public <S extends User> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    public Optional<User> findById(String s) {
        return Optional.empty();
    }

    public boolean existsById(String s) {
        return false;
    }

    public List<User> findAll() {
        return null;
    }

    public Iterable<User> findAllById(Iterable<String> strings) {
        return null;
    }

    public long count() {
        return 0;
    }

    public List<User> findAll(Sort sort) {
        return null;
    }

    public Page<User> findAll(Pageable pageable) {
        return null;
    }

    public <S extends User> S insert(S entity) {
        return null;
    }

    public <S extends User> List<S> insert(Iterable<S> entities) {
        return null;
    }

    public <S extends User> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    public <S extends User> List<S> findAll(Example<S> example) {
        return null;
    }

    public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    public <S extends User> long count(Example<S> example) {
        return 0;
    }

    public <S extends User> boolean exists(Example<S> example) {
        return false;
    }

    public Optional<User> findOne(Predicate predicate) {
        return Optional.empty();
    }

    public Iterable<User> findAll(Predicate predicate) {
        return null;
    }

    public Iterable<User> findAll(Predicate predicate, Sort sort) {
        return null;
    }

    public Iterable<User> findAll(Predicate predicate, OrderSpecifier<?>... orders) {
        return null;
    }

    public Iterable<User> findAll(OrderSpecifier<?>... orders) {
        return null;
    }

    public Page<User> findAll(Predicate predicate, Pageable pageable) {
        return null;
    }

    public long count(Predicate predicate) {
        return 0;
    }

    public boolean exists(Predicate predicate) {
        return false;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }
}
