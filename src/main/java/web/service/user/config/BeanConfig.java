package web.service.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import web.service.user.model.CustomAuthenticationManager;
import web.service.user.model.MailProperties;


@Configuration
public class BeanConfig {

    @Bean
    public MongoConfig mongoConfigBean(){
        return new MongoConfig();
    }

    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return new CustomAuthenticationManager();
    }

    @Bean
    public freemarker.template.Configuration getTemplate() {
        return new freemarker.template.Configuration();
    }
}
