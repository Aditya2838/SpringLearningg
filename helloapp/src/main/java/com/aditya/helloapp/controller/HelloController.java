package com.aditya.helloapp.controller;

import com.aditya.helloapp.model.User;
import com.aditya.helloapp.service.UserService;
import org.springframework.web.bind.annotation.*;

//import java.util.List;

@RestController
@RequestMapping("/users")
public class HelloController {

    private final UserService userService;

    // Prefer constructor injection
    public HelloController(UserService userService) {
        this.userService = userService;
    }

    // Health/home check
    @GetMapping("/")
    public String home() {
        return "Hello, World!";
    }

    // Create a user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user); // renamed to camelCase
    }

    // List all users (helpful to verify)
//    @GetMapping
//    public List<User> getAllUsers() {
//        return userService.findAll();
//    }

    // Optional: greet example (uncomment if you want it)
    // @GetMapping("/greet/{name}")
    // public String greet(@PathVariable String name) {
    //     return "Hello " + name;
    // }
}