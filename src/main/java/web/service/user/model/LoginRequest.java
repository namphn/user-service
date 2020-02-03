package web.service.user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {

    @Getter @Setter
    @NotNull
    private String userName;

    @Getter @Setter
    @NotNull
    private String password;
}
