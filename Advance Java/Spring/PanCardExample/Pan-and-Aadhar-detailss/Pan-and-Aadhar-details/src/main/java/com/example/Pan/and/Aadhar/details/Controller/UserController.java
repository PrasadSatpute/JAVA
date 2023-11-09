package com.example.Pan.and.Aadhar.details.Controller;

import com.example.Pan.and.Aadhar.details.Entities.UserInputRequest;
import com.example.Pan.and.Aadhar.details.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/check-pancode")
    public ResponseEntity<String> checkPancode(@RequestBody UserInputRequest userInput) {
        String result = userService.checkPancode(userInput.getPancode());
        return ResponseEntity.ok(result);
    }

    @PostMapping("/compare-names")
    public ResponseEntity<String> compareNames(@RequestBody UserInputRequest userInput) {
        double percentageMatched = userService.calculatePercentageMatched(userInput.getPanname(), userInput.getAadharname());
        return ResponseEntity.ok("Matched: " + percentageMatched + "%");
    }
}
