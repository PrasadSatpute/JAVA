package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final ApiCallerService apiCallerService;

    @Autowired
    public ApiController(ApiCallerService apiCallerService) {
        this.apiCallerService = apiCallerService;
    }

    @GetMapping("/callApi")
    public String callApi(int a) {
        // For demonstration purposes, let's assume you want to call the API 10 times
        for (int i = 0; i < 10; i++) {
            apiCallerService.callApiServic(i);
            System.out.println("API Count :- "+a+i);
        }

        return "Bulk API calls initiated";
    }
}
