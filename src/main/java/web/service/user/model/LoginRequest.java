package web.service.user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
public class LoginRequest {

    @Getter @Setter
    @NotNull
    @Email
    private String email;

    @Getter @Setter
    @NotNull
    private String password;
}
