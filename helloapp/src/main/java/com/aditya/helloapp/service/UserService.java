package com.aditya.helloapp.service;

import org.springframework.stereotype.Service;

import com.aditya.helloapp.model.User;
import com.aditya.helloapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List; // ✅ Added

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // ✅ New: Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(Long id, User updatedUser) {
        User user21 = userRepository.findById(id).orElse(null);
        if (user21 != null) {
            user21.setName(updatedUser.getName());
            user21.setAge(updatedUser.getAge());
            return userRepository.save(user21);
        }
        return null;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
