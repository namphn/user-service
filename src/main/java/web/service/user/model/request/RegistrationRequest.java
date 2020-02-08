package web.service.user.model.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class RegistrationRequest {
    @NotNull
    String email;
    @NotNull
    String password;
}
