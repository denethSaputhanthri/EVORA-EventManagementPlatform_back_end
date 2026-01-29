package edu.icet.service.impl;

import edu.icet.dto.UserDto;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    final UserRepository repository;
    final ModelMapper mapper;

    @Override
    public void addUser(UserDto user) {

    }

    @Override
    public void updateUser(UserDto user) {

    }

    @Override
    public void deleteUser(Integer userId) {

    }

    @Override
    public List<UserDto> getUserDetails() {
        return List.of();
    }

    @Override
    public UserDto searchById(Integer userId) {
        return null;
    }

    @Override
    public UserDto searchByName(String name) {
        return null;
    }

    @Override
    public UserDto searchByEmail(String email) {
        return null;
    }

    @Override
    public UserDto searchByRole(Enum role) {
        return null;
    }
}
