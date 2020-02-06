package web.service.user.model.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class RegistrationInformationRequest {
    @NotNull
    String userName;
    @NotNull
    String email;
    String phone;
}
