package com.microservice.user.service.controllers;

import com.microservice.user.service.entities.User;
import com.microservice.user.service.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping("/adduser")
    public ResponseEntity<User> createUser(@RequestBody User user)
    {
        User user1 = userServices.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @GetMapping("/{userID}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userID)
    {
        User user = userServices.getUser(userID);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAllUser()
    {
        List<User> allUser = userServices.getAllUser();
        return ResponseEntity.ok(allUser);
    }

}
