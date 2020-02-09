package web.service.user.model.response;

import lombok.Data;
import web.service.grpc.ConfirmEmailResponse;

@Data
public class RegistrationResponse {
    private String status;

    public RegistrationResponse(ConfirmEmailResponse response){
        this.status = response.getStatus();
    }
}
