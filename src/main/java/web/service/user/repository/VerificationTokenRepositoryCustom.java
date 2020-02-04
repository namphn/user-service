package web.service.user.repository;

import com.mongodb.client.MongoChangeStreamCursor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import web.service.user.config.MongoConfig;
import web.service.user.model.User;
import web.service.user.model.VerificationToken;

import java.util.List;
import java.util.Optional;

public class VerificationTokenRepositoryCustom implements VerificationTokenRepository {

    @Autowired
    private MongoConfig mongoConfig;

    @Override
    public VerificationToken findByToken(String token) {
//        mongoConfig = new MongoConfig();
        Query query = new Query();
        query.addCriteria(Criteria.where("token").is(token));
        VerificationToken verificationToken = mongoConfig.mongoTemplate().findOne(query, VerificationToken.class);
        return verificationToken;
    }

    @Override
    public VerificationToken findByUserEmail(String email) {
        Query query = new Query();
        query.addCriteria(Criteria.where(email).is(email));
        User user = mongoConfig.mongoTemplate().findOne(query, User.class);
        if(user == null) return null;
        Query findTokenByUser = new Query();
        query.addCriteria(Criteria.where("user").is(user));
        return mongoConfig.mongoTemplate().findOne(findTokenByUser, VerificationToken.class);
    }

    @Override
    public <S extends VerificationToken> S save(S s) {
        mongoConfig.mongoTemplate().save(s);
        return s;
    }

    @Override
    public <S extends VerificationToken> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<VerificationToken> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<VerificationToken> findAll() {
        return null;
    }

    @Override
    public Iterable<VerificationToken> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(VerificationToken verificationToken) {

    }

    @Override
    public void deleteAll(Iterable<? extends VerificationToken> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<VerificationToken> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<VerificationToken> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends VerificationToken> S insert(S s) {
        return null;
    }

    @Override
    public <S extends VerificationToken> List<S> insert(Iterable<S> iterable) {
        return null;
    }

    @Override
    public <S extends VerificationToken> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends VerificationToken> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends VerificationToken> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends VerificationToken> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends VerificationToken> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends VerificationToken> boolean exists(Example<S> example) {
        return false;
    }
}
