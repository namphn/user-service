package web.service.user.model.request;

import lombok.Data;

@Data
public class NewPasswordRequest {
    String newPassword;
    String newPasswordConfirm;
}
