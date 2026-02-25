package edu.icet.service;

import edu.icet.model.User;
import edu.icet.util.Role;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Integer userId);
    List<User>getUserDetails();
    User searchById(Integer userId);
    List<User> searchByName(String name);
    List<User> searchByEmail(String email);
    List<User> searchByRole(Role role);
}
