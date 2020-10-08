package web.service.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import web.service.user.model.UserInfo;

public interface UserInfoRepository extends MongoRepository<UserInfo, String> {
    UserInfo getByUserId(String userId);
}
