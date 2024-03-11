package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ApiScheduler {

    private final ApiCallerService apiCallerService;
    private final ApiController apiController;
    int i = 1;

    @Autowired
    public ApiScheduler(ApiCallerService apiCallerService, ApiController apiController) {
        this.apiCallerService = apiCallerService;
        this.apiController = apiController;
    }




//    @Scheduled(cron = "0 40 7 * * ?") // Adjust the fixedRate based on your scheduling needs
@Scheduled(cron = "*/10 * * * * ?")
public void scheduleApiCall() {
        // Call your API in the scheduler
//        apiCallerService.callApiServic(i++);
        System.out.println(apiController.callApi(i++));
        // Log the scheduled time for verification (optional)
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("API call scheduled at: " + dateFormat.format(new Date()));
    }
}
