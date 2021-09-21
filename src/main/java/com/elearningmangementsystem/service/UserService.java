package com.elearningmangementsystem.service;


import com.elearningmangementsystem.model.User;
import com.elearningmangementsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> getAllUser() {
        List<User>user = userRepository.findAll();
        return user;
    }

    public Optional<User> getUser(Integer id) {
        return userRepository.findById(id);
    }

    public void addUser(User user) {
         userRepository.save(user);
    }

    public void updateUser(User user, Integer id) {
        userRepository.save(user);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
