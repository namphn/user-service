package web.service.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import web.service.user.model.Images;

public interface ImagesRepository extends MongoRepository<Images, String> {
    Images getByUserId(String userId);
}
