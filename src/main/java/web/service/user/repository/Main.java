package web.service.user.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import web.service.user.model.User;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        User user = new User("1","nam", "1234", "hoangnamuet.vnu@gmail.com", "my dinh", "12345678");

        User.userRepository.insertUser(user);
    }
}
