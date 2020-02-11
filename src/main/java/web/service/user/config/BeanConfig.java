package web.service.user.config;


import com.sendgrid.SendGrid;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import web.service.user.model.MailProperties;


@Configuration
public class BeanConfig {

    @Bean
    ManagedChannel chanelBean(){
        return ManagedChannelBuilder.forAddress("localhost", 6566).usePlaintext().build();
    }

}
