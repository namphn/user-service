package web.service.user.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import web.service.user.repository.UserRepository;

import java.util.Set;

@Data
@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String password;
    private String userName;

    public User(String userName, String password){

        this.password = password;
        this.userName = userName;

    }



}
