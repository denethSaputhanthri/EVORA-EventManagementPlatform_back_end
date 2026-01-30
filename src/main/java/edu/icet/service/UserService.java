package edu.icet.service;

import edu.icet.dto.UserDto;
import edu.icet.Enum.Role;

import java.util.List;

public interface UserService {
    void addUser(UserDto user);
    void updateUser(UserDto user);
    void deleteUser(Integer userId);
    List<UserDto>getUserDetails();
    UserDto searchById(Integer userId);
    List<UserDto> searchByName(String name);
    List<UserDto> searchByEmail(String email);
    List<UserDto> searchByRole(Role role);
}
