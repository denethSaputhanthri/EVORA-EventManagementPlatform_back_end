package edu.icet.service.impl;

import edu.icet.dto.UserDto;
import edu.icet.entity.UserEntity;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepository repository;
    final ModelMapper mapper;

    @Override
    public void addUser(UserDto user) {
        repository.save(mapper.map(user, UserEntity.class));
    }

    @Override
    public void updateUser(UserDto user) {
        repository.save(mapper.map(user,UserEntity.class));
    }

    @Override
    public void deleteUser(Integer userId) {
        repository.deleteById(userId);
    }

    @Override
    public List<UserDto> getUserDetails() {
        List<UserEntity>entities=repository.findAll();
        ArrayList<UserDto>userDtoArrayList=new ArrayList<>();
        entities.forEach(userEntity -> {
            UserDto userDto=mapper.map(userEntity, UserDto.class);
            userDtoArrayList.add(userDto);
        });
        return userDtoArrayList;
    }

    @Override
    public UserDto searchById(Integer userId) {
        return mapper.map(repository.findById(userId).get(), UserDto.class);
    }

    @Override
    public List<UserDto> searchByName(String name) {
        List<UserEntity>entities=repository.findAllByname(name);
        ArrayList<UserDto>userDtoArrayList=new ArrayList<>();
        entities.forEach(userEntity -> {
            UserDto userDto=mapper.map(userEntity, UserDto.class);
            userDtoArrayList.add(userDto);
        });
        return userDtoArrayList;
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

