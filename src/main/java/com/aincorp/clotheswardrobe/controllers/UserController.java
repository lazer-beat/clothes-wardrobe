package com.aincorp.clotheswardrobe.controllers;

import com.aincorp.clotheswardrobe.entities.User;
import com.aincorp.clotheswardrobe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class UserController {

    @Autowired
    private UserService userService;

    Map<String, String> errors;

    @GetMapping(value = "/allUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
