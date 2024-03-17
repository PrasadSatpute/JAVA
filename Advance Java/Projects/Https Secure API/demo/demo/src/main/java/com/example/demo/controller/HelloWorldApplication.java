package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/home")
public class HelloWorldApplication {
    @GetMapping("/test")
    public String hello() {
        return "Hello, World!";
    }
}
