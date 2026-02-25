package com.aditya.helloapp.service;

import org.springframework.stereotype.Service;

import com.aditya.helloapp.model.User;
import com.aditya.helloapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

}
