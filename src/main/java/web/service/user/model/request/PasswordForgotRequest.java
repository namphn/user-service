package web.service.user.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import web.service.grpc.PasswordResetRequest;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasswordForgotRequest {
    String email;
}
