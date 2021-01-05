package web.service.user.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Document(collection = "UsersInformation")
public class UserInfo {
    @Id
    String id;
    String userId;
    String avatar;
    String intro;
    String city;
    String country;
    String description;
    List<String> images;

    public UserInfo(String userId) {
        this.userId = userId;
        this.images = new ArrayList<>();
    }
}
