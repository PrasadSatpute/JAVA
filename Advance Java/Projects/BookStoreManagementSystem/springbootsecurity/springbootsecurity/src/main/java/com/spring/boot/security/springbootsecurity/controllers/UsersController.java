package com.spring.boot.security.springbootsecurity.controllers;

import com.spring.boot.security.springbootsecurity.models.User;
import com.spring.boot.security.springbootsecurity.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserService userService;

    @GetMapping("/allusers")
    public List<User> getAllUsers()
    {
        return this.userService.getAllUsers();
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable String username)
    {
        return this.userService.getSingleUser(username);
    }

    @PutMapping("adduser")
    public User addUser(@RequestBody User user)
    {
        return this.userService.addUser(user);
    }

}
