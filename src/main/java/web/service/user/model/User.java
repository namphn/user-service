package web.service.user.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import web.service.user.repository.UserRepository;

@Data
@Document(collection = "users")
public class User {
    String name;
    String password;
    String email;
    String address;
    String phoneNumber;

    @Autowired
    public static UserRepository userRepository;

    public User(String name, String password, String email, String address, String phoneNumber){
        this.name = name;
        this.password = password;
        this.email = email;
        this.address =address;
        this.phoneNumber = phoneNumber;
    }



}
