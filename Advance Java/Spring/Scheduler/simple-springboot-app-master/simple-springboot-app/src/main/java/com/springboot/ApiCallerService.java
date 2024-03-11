package com.springboot;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiCallerService {

    private final RestTemplate restTemplate;

    public ApiCallerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void callApiServic(int count) {
        // Implement your logic to call the API using restTemplate
        // You can customize this method based on your API and data
//        String result = restTemplate.getForObject(url, String.class);
        System.out.println("API Response: " + count);
    }
}
