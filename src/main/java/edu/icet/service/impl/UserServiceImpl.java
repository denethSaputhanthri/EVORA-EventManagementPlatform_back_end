package edu.icet.service.impl;

import edu.icet.model.User;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserService;
import edu.icet.util.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    final private UserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    @Override
    public void deleteUser(Integer userId) {
        userRepository.deleteUser(userId);
    }

    @Override
    public List<User> getUserDetails() {
        return userRepository.getUserDetails();
    }

    @Override
    public User searchById(Integer userId) {
        return userRepository.searchById(userId);
    }

    @Override
    public List<User> searchByName(String name) {
        return userRepository.searchByName(name);
    }

    @Override
    public List<User> searchByEmail(String email) {
        return userRepository.searchByEmail(email);
    }

    @Override
    public List<User> searchByRole(Role role) {
        return userRepository.searchByRole(role);
    }
}

