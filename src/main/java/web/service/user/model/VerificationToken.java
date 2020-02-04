package web.service.user.model;

import lombok.Data;
import org.apache.tomcat.jni.Local;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

@Data
@Document(collection = "verificationToken")
public class VerificationToken {

    public static final String STATUS_PENDING = "PENDING";
    public static final String STATUS_VERIFIED = "VERIFIED";

    private static final int EXPIRATION = 60 * 24;

    @Id
    private String id;
    private String token;
    private String status;
    private User user;
    private LocalDateTime expiryDateTime;
    private LocalDateTime issuedDateTime;
    private LocalDateTime confirmDateTime;

    private Date calculateExpiryDate(int expiryTimeInMinutes) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Timestamp(cal.getTime().getTime()));
        cal.add(Calendar.MINUTE, expiryTimeInMinutes);
        return new Date(cal.getTime().getTime());
    }

    public VerificationToken(){
        this.token = UUID.randomUUID().toString();
        this.issuedDateTime = LocalDateTime.now();
        this.expiryDateTime = this.issuedDateTime.plusDays(1);
        this.status = STATUS_PENDING;
    }

}
