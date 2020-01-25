package web.service.user.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import web.service.user.repository.UserRepository;

import java.util.Set;

@Data
@Document(collection = "users")
public class User {
    private String name;
    private String password;
    private String email;
    private String address;
    private String phoneNumber;
    private Set<Role> roles;

    @Autowired
    public static UserRepository userRepository;

    public User(String name, String password, String email, String address, String phoneNumber,
                Set<Role> roles){
        this.name = name;
        this.password = password;
        this.email = email;
        this.address =address;
        this.phoneNumber = phoneNumber;
        this.roles = roles;
    }



}
