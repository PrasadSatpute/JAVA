package com.example.demo.controller;

import com.example.demo.model.Users;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UsersController {

    private UserService userService;

    @PostMapping("/createUsers")
    public Users creatUsers(@RequestBody Users users)
    {
        return userService.createUsers(users);
    }

    @GetMapping("/readAllUsers")
    public List<Users> readAllUsers()
    {
        return userService.readAllUsers();
    }

}
