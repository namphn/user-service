package web.service.user.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import web.service.user.repository.UserRepository;

import java.util.Set;

@Data
@Document(collection = "users")
@NoArgsConstructor
public class User {

    @Id
    private String id;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private boolean sex;
    private String phone;

    @Getter @Setter
    private boolean enable;

    public User(String email, String password, String firstName, String lastName, boolean sex){
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }
}
