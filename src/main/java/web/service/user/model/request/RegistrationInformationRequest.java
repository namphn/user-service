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

    public RegistrationInformationRequest(web.service.grpc.RegistrationInformationRequest request){
        this.email = request.getEmail();
        this.userName = request.getUserName();
        this.phone = request.getPhone();
    }
}
