package com.aincorp.clotheswardrobe.controllers;

import com.aincorp.clotheswardrobe.entities.Role;
import com.aincorp.clotheswardrobe.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class RoleController {

    @Autowired
    private RoleService roleService;

    Map<String, String> errors;

    @GetMapping(value = "/allRoles")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }
}
