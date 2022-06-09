package com.slfj4;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@RestController
public class Slfj4Application {
	
	Logger logger = LoggerFactory.getLogger(Slfj4Application.class);
	
	@GetMapping("/testSLF4J")
	public String greeting(@PathVariable String name)
	{
		logger.debug("Request {}",name);
		String response = "Hi" + name + "Welcome to SLF4J TEST CODE";
		logger.debug("Response {}",response);
		return response;
	}

	public static void main(String[] args) {
		
		
		
		SpringApplication.run(Slfj4Application.class, args);
		
		
        System.out.println("hello .. ");
		
//		logger.trace("this is trace msg");
//		logger.debug("this is debug msg");
//		logger.info("this is info msg");
//		logger.warn("this is warn msg");
//		logger.error("this is error msg");
		
		
	}

}
