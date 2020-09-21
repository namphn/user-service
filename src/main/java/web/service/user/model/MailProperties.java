package web.service.user.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "mail")
public class MailProperties {
    @Data
    public static class SMTP {
        String host;
        String port;
        String username;
        String password;

    }

    private SMTP smtp;
    private String from;
    private String fromName;
    private String verificationApi;

}
