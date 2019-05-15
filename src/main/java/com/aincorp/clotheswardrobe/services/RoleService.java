package com.aincorp.clotheswardrobe.services;

import com.aincorp.clotheswardrobe.entities.Role;
import com.aincorp.clotheswardrobe.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role save(Role role) {
        return roleRepository.save(role);
    }

    public Role getOne(Long id) {
        return roleRepository.getOne(id);
    }
}
