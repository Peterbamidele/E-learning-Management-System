package com.elearningmangementsystem.controller;

import com.elearningmangementsystem.model.User;
import com.elearningmangementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userservice;

    @GetMapping("/users")
    public List<User> getAllUser(){
        return userservice.getAllUser();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getUser(@PathVariable Integer id){
        return userservice.getUser(id);
    }

    @PostMapping("/users")
    public void  addUser(@RequestBody User user){
        userservice.addUser(user);
    }

    @PutMapping("/users/{id}")
    public void updateUser(@RequestBody User user, @PathVariable Integer id) {
        userservice.updateUser(user, id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(Integer id){
        userservice.deleteUser(id);
    }

}
