package web.service.user.config;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
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

    @Bean("newsfeed-service")
    ManagedChannel newsFeedGrpcBeanChanel(){
        return ManagedChannelBuilder.forAddress("localhost", 6569).usePlaintext().build();
    }

    @Bean("follow-service")
    ManagedChannel followGrpcBeanChanel(){
        return ManagedChannelBuilder.forAddress("localhost", 6569).usePlaintext().build();
    }
}
