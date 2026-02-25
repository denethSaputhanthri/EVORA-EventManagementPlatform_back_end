package edu.icet.controller;

import edu.icet.model.User;
import edu.icet.util.Role;
import edu.icet.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
@Tag(name = "User-Controller",description = "User API Collection..")
public class UserController {

    final UserService service;

    @PostMapping("/add/details")
    public void addUserDetails(@RequestBody User user){
        service.addUser(user);
    }
    @GetMapping("/get/details")
    public List<User> getUserDetails(){
        return service.getUserDetails();
    }
    @PutMapping("/update/details")
    public void updateUserDetails(@RequestBody User user){
        service.updateUser(user);
    }
    @DeleteMapping("/delete/details/{userId}")
    public void deleteUser(@PathVariable Integer userId){
        service.deleteUser(userId);
    }
    @GetMapping("/searchById/{userId}")
    public User searchById(@PathVariable Integer userId){
        return service.searchById(userId);
    }
    @GetMapping("/searchByName/{name}")
    public List<User> searchByName(@PathVariable String name){
        return service.searchByName(name);
    }
    @GetMapping("/searchByEmail/{email}")
    public List<User> searchByEmail(@PathVariable String email){
        return service.searchByEmail(email) ;
    }
    @GetMapping("/searchByRole/{role}")
    public List<User> searchByRole(@PathVariable Role role){
        return service.searchByRole(role);
    }

}
