package com.example.Pan.and.Aadhar.details.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserInputRequest {
    private String pancode;
    private String panname;
    private String aadharname;
    private String aadharnumber;

    // getters and setters
}
