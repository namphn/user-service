package web.service.user.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
public class Role implements Serializable {

    private static final long serialVersionID = 1L;
    private String name;

    public Role(String roleName){
        this.name = roleName;
    }
}
