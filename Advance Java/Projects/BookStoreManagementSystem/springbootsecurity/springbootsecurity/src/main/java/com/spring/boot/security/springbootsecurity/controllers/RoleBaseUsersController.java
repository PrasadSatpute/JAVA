package com.spring.boot.security.springbootsecurity.controllers;

import com.spring.boot.security.springbootsecurity.models.User;
import com.spring.boot.security.springbootsecurity.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class RoleBaseUsersController {
    @Autowired
    private UserService userService;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public List<User> getAllUsers1()
    {
        return this.userService.getAllUsers();
    }

    @PreAuthorize("hasRole('NORMAL')")
    @GetMapping("/normal")
    public List<User> getAllUsers2()
    {
        return this.userService.getAllUsers();
    }

    @GetMapping("/public")
    public List<User> getAllUsers3()
    {
        return this.userService.getAllUsers();
    }

}
