package com.springboot.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class HelloWorldController {
	
	//GET HTTP METHOD
	//http://localhost:8080/hello
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
}
