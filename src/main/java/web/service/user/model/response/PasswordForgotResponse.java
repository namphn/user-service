package web.service.user.model.response;

import lombok.Data;
import web.service.grpc.PasswordResetResponse;

@Data
public class PasswordForgotResponse {
    String email;
    String status;

    public PasswordForgotResponse(PasswordResetResponse response){
        this.email = response.getEmail();
        this.status = response.getStatus();
    }
}
