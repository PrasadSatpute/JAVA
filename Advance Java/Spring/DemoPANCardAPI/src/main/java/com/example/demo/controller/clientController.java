package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.pancarddetails;
import com.example.demo.service.clientService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/client")
public class clientController {
	
	@Autowired
    private clientService service;

    @PostMapping("/createClient")
    public pancarddetails creatUsers(@RequestBody pancarddetails pancarddetails)
    {
        return service.createUsers(pancarddetails);
    }

    @GetMapping("/readAllClient")
    public List<Object> readAllUsers()
    {
        return service.readAllUsers();
    }

}
