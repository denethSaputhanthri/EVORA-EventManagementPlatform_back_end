package edu.icet.dto;

import edu.icet.Enum.Role;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class UserDto {
    private Integer userId;
    private String name;
    private String email;
    private String passwordHash;
    private Role role;
    private Date createAt;
}
