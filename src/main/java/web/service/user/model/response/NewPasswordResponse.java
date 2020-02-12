package web.service.user.model.response;

import lombok.Data;

@Data
public class NewPasswordResponse {
    String email;
    String status;

    public NewPasswordResponse(web.service.grpc.NewPasswordResponse response){
        this.email = response.getEmail();
        this.status = response.getStatus();
    }
}
