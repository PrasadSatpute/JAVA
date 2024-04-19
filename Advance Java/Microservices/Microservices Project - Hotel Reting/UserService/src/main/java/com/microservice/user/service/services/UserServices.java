package com.microservice.user.service.services;

import com.microservice.user.service.entities.User;

import java.util.List;

public interface UserServices {
    //User Operation

    //create
    User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get single user of given userID
    User getUser(String Id);
}
