package edu.icet.contoller;

import edu.icet.dto.UserDto;
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
    public void addUserDetails(@RequestBody UserDto user){
        service.addUser(user);
    }
    @GetMapping("/get/details")
    public List<UserDto> getUserDetails(){
        return service.getUserDetails();
    }
    @PutMapping("/update/details")
    public void updateUserDetails(@RequestBody UserDto user){
        service.updateUser(user);
    }
}
