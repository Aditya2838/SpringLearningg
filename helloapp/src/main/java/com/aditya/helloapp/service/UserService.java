package com.aditya.helloapp.service;

import org.springframework.stereotype.Service;
import com.aditya.helloapp.model.User;

@Service
public class UserService {

	public User processUser(User user) {
		user.setName(user.getName().toUpperCase());
		
		return user;
	}

}
