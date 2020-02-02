package web.service.user.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import web.service.user.repository.UserRepository;
import web.service.user.repository.UserRepositoryCustom;

import java.util.Set;

@Data
@Document(collection = "userdto")
public class User {

    private String password;
    private String email;

    @Autowired
    public static UserRepositoryCustom userRepository;

    public User(String email, String password){
        this.email = email;
        this.password = password;
    }



}
