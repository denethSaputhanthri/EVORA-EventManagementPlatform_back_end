package edu.icet.repository.impl;

import edu.icet.model.User;
import edu.icet.repository.UserRepository;
import edu.icet.util.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public boolean addUser(User user) {
        String sql = "INSERT INTO user VALUES(?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,
                user.getUserId(),
                user.getName(),
                user.getEmail(),
                user.getPasswordHash(),
                user.getRole(),
                user.getCreateAt()
        )>0;
    }

    @Override
    public boolean updateUser(User user) {
        String sql = "update user set full_name=?,email=?,password=?,role=?,createAt=? where user_id=?";
        return jdbcTemplate.update(sql,
                user.getUserId(),
                user.getName(),
                user.getEmail(),
                user.getPasswordHash(),
                user.getRole(),
                user.getCreateAt()
        )>0;
    }

    @Override
    public boolean deleteUser(Integer userId) {
        String sql ="DELETE FROM user WHERE user_id=?";
        return jdbcTemplate.update(sql,userId)>0;
    }

    @Override
    public List<User> getUserDetails() {
        String sql="SELECT * FROM user";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            User user = new User();
            user.setUserId(rs.getInt("user_id"));
            user.setName(rs.getString("full_name"));
            user.setEmail(rs.getString("email"));
            user.setPasswordHash(rs.getString("password"));
            user.setRole(Role.valueOf(rs.getString("role")));
            user.setCreateAt(rs.getTimestamp("create_at"));
            return user;
        });
    }

    @Override
    public User searchById(Integer userId) {
        String sql ="SELECT * FROM user WHERE user_id=?";
        return jdbcTemplate.queryForObject(sql,(rs, rowNum) -> {
            User user = new User();
            user.setUserId(rs.getInt("user_id"));
            user.setName(rs.getString("full_name"));
            user.setEmail(rs.getString("email"));
            user.setPasswordHash(rs.getString("password"));
            user.setRole(Role.valueOf(rs.getString("role")));
            user.setCreateAt(rs.getTimestamp("create_at"));
            return user;
        },userId) ;
    }

    @Override
    public List<User> searchByName(String name) {
        String sql="SELECT * FROM user WHERE full_name=?";
        List<User> userList=new ArrayList<>();
        jdbcTemplate.query(sql,(rs, rowNum) -> {
            User user = new User();
            user.setUserId(rs.getInt("user_id"));
            user.setName(rs.getString("full_name"));
            user.setEmail(rs.getString("email"));
            user.setPasswordHash(rs.getString("password"));
            user.setRole(Role.valueOf(rs.getString("role")));
            user.setCreateAt(rs.getTimestamp("create_at"));
            return  user;
        },name);
        return userList;
    }

    @Override
    public List<User> searchByEmail(String email) {
        String sql="SELECT * FROM user WHERE email=?";
        List<User> userList=new ArrayList<>();
        jdbcTemplate.query(sql,(rs, rowNum) -> {
            User user = new User();
            user.setUserId(rs.getInt("user_id"));
            user.setName(rs.getString("full_name"));
            user.setEmail(rs.getString("email"));
            user.setPasswordHash(rs.getString("password"));
            user.setRole(Role.valueOf(rs.getString("role")));
            user.setCreateAt(rs.getTimestamp("create_at"));
            return  user;
        },email);
        return userList;
    }

    @Override
    public List<User> searchByRole(Role role) {
        String sql="SELECT * FROM user WHERE role=?";
        List<User> userList=new ArrayList<>();
        jdbcTemplate.query(sql,(rs, rowNum) -> {
            User user = new User();
            user.setUserId(rs.getInt("user_id"));
            user.setName(rs.getString("full_name"));
            user.setEmail(rs.getString("email"));
            user.setPasswordHash(rs.getString("password"));
            user.setRole(Role.valueOf(rs.getString("role")));
            user.setCreateAt(rs.getTimestamp("create_at"));
            return  user;
        },role);
        return userList;
    }
}
