package web.service.user.model;

import org.springframework.data.mongodb.core.mapping.Document;
import web.service.user.model.Token;

@Document
public class PasswordResetToken extends Token {
    public PasswordResetToken(){
        super();
    }

}
