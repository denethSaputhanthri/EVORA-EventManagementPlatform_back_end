package edu.icet.model;

import edu.icet.util.Role;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class User {
    private Integer userId;
    private String name;
    private String email;
    private String passwordHash;
    private Role role;
    private Date createAt;
}
