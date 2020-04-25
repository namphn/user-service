package web.service.user.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

@Data
public class Token {
    public static final String STATUS_PENDING = "PENDING";
    public static final String STATUS_VERIFIED = "VERIFIED";

    @Id
    protected String id;
    protected String token;
    protected String status;
    protected String userId;
    protected LocalDateTime expiryDateTime;
    protected LocalDateTime issuedDateTime;
    protected LocalDateTime confirmDateTime;

    public Token(){
        this.token = UUID.randomUUID().toString();
        this.issuedDateTime = LocalDateTime.now();
        this.expiryDateTime = this.issuedDateTime.plusDays(1);
        this.status = STATUS_PENDING;
    }
}
