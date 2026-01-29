package edu.icet.service.impl;

import edu.icet.dto.UserDto;
import edu.icet.repository.EventRepository;
import edu.icet.role.Role;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EventServiceImpl implements UserService {

    final EventRepository repository;
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
    public List<UserDto> searchByName(String name) {
        return List.of();
    }

    @Override
    public List<UserDto> searchByEmail(String email) {
        return List.of();
    }

    @Override
    public List<UserDto> searchByRole(Role role) {
        return List.of();
    }
}
