package logging;
import org.apache.logging.log4j.LogManager;


import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingApplication {
	
	static Logger logger = LogManager.getLogger(LoggingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);
		
		System.out.println("hello .. ");
		
		logger.trace("this is trace msg");
		logger.debug("this is debug msg");
		logger.info("this is info msg");
		logger.warn("this is warn msg");
		logger.error("this is error msg");
		logger.fatal("this is fatal msg");
		
		
	}

}
