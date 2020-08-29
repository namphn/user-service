package web.service.user.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories
public class MongoConfig extends AbstractMongoConfiguration {

    @Value( "${mongo.remoteUri}")
    private String mongoURi;

    @Override
    public MongoClient mongoClient() {
        MongoClientURI uri = new MongoClientURI(mongoURi);
        return new MongoClient(uri);
    }

    @Override
    protected String getDatabaseName() {
        return "user";
    }

    @Override
    public MongoTemplate mongoTemplate(){
        return new MongoTemplate(mongoClient(),"user");
    }

}
