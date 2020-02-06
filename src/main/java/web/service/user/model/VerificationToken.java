package web.service.user.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "verificationToken")
public class VerificationToken extends Token {

    public VerificationToken(){
        super();
    }

}
