package slfj4;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Slfj4Application {

	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.getLogger(Slfj4Application.class);
		
		SpringApplication.run(Slfj4Application.class, args);
		
		
        System.out.println("hello .. ");
		
		logger.trace("this is trace msg");
		logger.debug("this is debug msg");
		logger.info("this is info msg");
		logger.warn("this is warn msg");
		logger.error("this is error msg");
		
		
	}

}
