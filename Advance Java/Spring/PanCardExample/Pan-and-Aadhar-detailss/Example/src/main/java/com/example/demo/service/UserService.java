package com.example.demo.service;

import com.example.demo.model.pancarddetails;
import com.example.demo.repository.UsersDataRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    @Autowired
    UsersDataRepository usersDataRepository;

    public pancarddetails createUsers(pancarddetails pancarddetails){
        return usersDataRepository.save(pancarddetails);
    }

    public List<pancarddetails> readAllUsers()
    {
        return usersDataRepository.findAll();
    }

}
