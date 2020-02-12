package web.service.user.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class LoginResponse implements Serializable {
    private String token;
    private String status;

    public LoginResponse(web.service.grpc.LoginResponse response){
        this.token = response.getToken();
        this.status = response.getStatus();
    }
}
