package edu.icet.repository;


import edu.icet.model.User;
import edu.icet.util.Role;

import java.util.List;

public interface UserRepository {
    boolean addUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(Integer userId);
    List<User> getUserDetails();
    User searchById(Integer userId);
    List<User> searchByName(String name);
    List<User> searchByEmail(String email);
    List<User> searchByRole(Role role);
}
