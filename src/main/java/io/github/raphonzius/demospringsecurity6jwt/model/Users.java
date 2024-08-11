package io.github.raphonzius.demospringsecurity6jwt.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table("USERS")
public class Users {

    @Id
    private Integer id;
    private String username;
    private String password;

}
