package logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	static Logger logger = LogManager.getLogger(LoggingApplication.class);
	
	@GetMapping("/test")
	public String test() {
		
		logger.warn("controller executing");
		return "hello logger";
	}

}
