package web.service.user.model.request;

import lombok.Data;
import web.service.grpc.PasswordResetRequest;

@Data
public class PasswordForgotRequest {
    String email;

    public PasswordForgotRequest(PasswordResetRequest request){
        this.email = request.getEmail();
    }
}
