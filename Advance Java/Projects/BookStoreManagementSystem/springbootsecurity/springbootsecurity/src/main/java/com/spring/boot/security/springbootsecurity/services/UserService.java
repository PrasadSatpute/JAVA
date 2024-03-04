package com.spring.boot.security.springbootsecurity.services;

import com.spring.boot.security.springbootsecurity.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("abc","abc","abc@gmail.com"));
        list.add(new User("abc","abc","abc@gmail.com"));
    }

    public List<User> getAllUsers()
    {
        return this.list;
    }

    public User getSingleUser(String userName)
    {
        return this.list.stream().filter((user) -> user.getUserName().equals(userName)).findAny().orElse(null);
    }

    public User addUser(User user)
    {
        this.list.add(user);
        return user;
    }
}
