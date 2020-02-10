package web.service.user.config;

import com.sendgrid.SendGrid;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import web.service.user.service.JwtAuthenticationEntryPoint;

@Configuration
public class BeanConfig {

    @Bean
    ManagedChannel chanelBean(){
        return ManagedChannelBuilder.forAddress("localhost", 6566).usePlaintext().build();
    }

    @Bean
    public SendGrid sendGridBean(){
        return new SendGrid("your key");
    }

}
