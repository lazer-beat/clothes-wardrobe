package com.aincorp.clotheswardrobe.services;

import com.aincorp.clotheswardrobe.entities.User;
import com.aincorp.clotheswardrobe.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User getOne(Long id) {
        return userRepository.getOne(id);
    }
}
