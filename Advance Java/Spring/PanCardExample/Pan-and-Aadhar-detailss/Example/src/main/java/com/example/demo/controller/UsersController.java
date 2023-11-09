package com.example.demo.controller;

import com.example.demo.model.pancarddetails;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UsersController {

    @Autowired(required=true)
    private UserService userService;

    @PostMapping("/createUsers")
    public pancarddetails creatUsers(@RequestBody pancarddetails pancarddetails)
    {
        return userService.createUsers(pancarddetails);
    }

    @GetMapping("/readAllUsers")
    public List<pancarddetails> readAllUsers()
    {
        return userService.readAllUsers();
    }

}
