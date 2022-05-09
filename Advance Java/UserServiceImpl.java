package com.user.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	
	List<User> list = List.of(
			new User(01, "ABCD", "dsd"),
			new User(02, "AC4", "zxz"),
			new User(03, "HD5", "gd"),
			new User(04, "KH6", "gng")
			);
	
	
	@Override
	public User getUser(Long id) {
		User user = null;
		
		for (User u : list) {
			if(u.getUserid() == id)
			{
				user = u;
			}
		}
		
		return user;
	}

}
