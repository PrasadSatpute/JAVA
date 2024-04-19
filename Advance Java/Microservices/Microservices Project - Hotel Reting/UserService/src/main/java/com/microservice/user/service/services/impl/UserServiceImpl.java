package com.microservice.user.service.services.impl;

import com.microservice.user.service.entities.User;
import com.microservice.user.service.exceptions.ResorceNotFoundException;
import com.microservice.user.service.repository.UserRepository;
import com.microservice.user.service.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String randomUserID = UUID.randomUUID().toString();
        user.setUserID(randomUserID);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(() -> new ResorceNotFoundException("User with given ID is not found on Server !! : " + userId));
    }
}
