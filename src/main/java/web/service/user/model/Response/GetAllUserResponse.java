package web.service.user.model.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import web.service.user.model.User;
import java.util.List;

@Data
@AllArgsConstructor
public class GetAllUserResponse {

    List<User> allUser;

}
