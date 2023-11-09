package com.example.demo.controller;


import com.example.demo.model.pancarddetails;
import com.example.demo.service.clientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/client")
public class PanController {

    private clientService service;

    @PostMapping("/createClient")
    public String createClient(@RequestBody pancarddetails pancarddetails)
    {
        return service.addClient(pancarddetails);
    }

//    @GetMapping("/readAllUsers")
//    public List<pancarddetails> readAllUsers()
//    {
//        return userService.readAllUsers();
//    }

}

