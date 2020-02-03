package web.service.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class LoginResponse implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;
    private String authToken;

}
