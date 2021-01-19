package web.service.user.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
@NoArgsConstructor
public class User {

    @Id
    private String id;
    private String password;
    private String email;
    private String name;

    @Getter @Setter
    private boolean enable;

    public User(String email, String password, String name){
        this.password = password;
        this.email = email;
        this.name = name;
    }
}
