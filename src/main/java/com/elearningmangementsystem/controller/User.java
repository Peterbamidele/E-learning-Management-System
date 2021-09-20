package com.elearningmangementsystem.controller;

import com.elearningmangementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class User {

    @Autowired
    private UserService userservice;




}
