package edu.icet.service.impl;

import edu.icet.model.User;
import edu.icet.service.UserService;
import edu.icet.util.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(Integer userId) {

    }

    @Override
    public List<User> getUserDetails() {
        return List.of();
    }

    @Override
    public User searchById(Integer userId) {
        return null;
    }

    @Override
    public List<User> searchByName(String name) {
        return List.of();
    }

    @Override
    public List<User> searchByEmail(String email) {
        return List.of();
    }

    @Override
    public List<User> searchByRole(Role role) {
        return List.of();
    }
}

