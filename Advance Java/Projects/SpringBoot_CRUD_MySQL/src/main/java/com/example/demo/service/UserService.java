package com.example.demo.service;

import com.example.demo.model.Users;
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

    public Users createUsers(Users users){
        return usersDataRepository.save(users);
    }

    public List<Users> readAllUsers()
    {
        return usersDataRepository.findAll();
    }

}
