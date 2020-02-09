package web.service.user.model.request;

import lombok.Data;
import web.service.grpc.RegistrationRequestGrpc;

import javax.validation.constraints.NotNull;

@Data
public class RegistrationRequest {
    @NotNull
    String email;
    @NotNull
    String password;

    public RegistrationRequest(RegistrationRequestGrpc requestGrpc){
        this.email = requestGrpc.getEmail();
        this.password = requestGrpc.getPassword();
    }
}
