package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hi")
public class HelloWorld {

	@GetMapping("/hello")
	public void hello() {
		System.out.println("hellooo");
		
	}
	
}
