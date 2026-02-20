package com.aditya.helloapp.controller;
import org.springframework.web.bind.annotation.RestController;

import com.aditya.helloapp.model.User;
import com.aditya.helloapp.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/users")
public class HelloController {

	/*
	 * @GetMapping("/greet/{name}") public String greet(@PathVariable String name) {
	 * return "Hello"+ name; }
	 */
	@Autowired
	private UserService userService;
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		return userService.processUser(user);
	}
}
