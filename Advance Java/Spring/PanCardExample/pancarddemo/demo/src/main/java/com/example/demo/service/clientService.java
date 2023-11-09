package com.example.demo.service;

import com.example.demo.model.pancarddetails;
import com.example.demo.repository.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class clientService {

    @Autowired(required=true)
    private clientRepository repository;

    public String checkPancode(String pancode) {
        if (pancode != null && pancode.matches("[A-Z]{3}[P]{1}[A-Z]{1}[0-9]{4}[A-Z]{1}")) {
            return "It is an individual pancode";
        } else {
            return "Please enter individual pancode";
        }
    }

    public String addClient(pancarddetails pancard)
    {
        repository.save(pancard);

        return "Add Client";
    }

}
