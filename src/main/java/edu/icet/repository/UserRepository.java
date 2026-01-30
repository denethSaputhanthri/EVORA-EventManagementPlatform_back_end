package edu.icet.repository;

import edu.icet.entity.UserEntity;
import edu.icet.Enum.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    List<UserEntity> findAllByname(String name);
    List<UserEntity> findAllByemail(String email);
    List<UserEntity> findAllByrole(Role role);
}
