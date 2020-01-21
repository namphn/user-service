package web.service.user.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

    @Bean
    public MongoClient mongoClient() {
        return new MongoClient("localhost", 2707);
    }

    @Bean
    protected String getDatabaseName() {
        return "user";
    }

    @Bean
    public MongoTemplate mongoTemplate(){
        return new MongoTemplate(mongoClient(),"user");
    }
}
