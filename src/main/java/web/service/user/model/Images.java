package web.service.user.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;

@Data
public class Images {
    @Id
    String id;
    String userId;
    ArrayList<String> imageIds;

    public Images(String userId) {
        this.userId = userId;
        this.imageIds = new ArrayList<>();
    }
}
