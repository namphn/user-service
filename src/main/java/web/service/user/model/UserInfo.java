package web.service.user.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "UsersInformation")
public class UserInfo {
    @Id
    String id;
    String userId;
    String avatar;
    String intro;
    List<String> images;
}
