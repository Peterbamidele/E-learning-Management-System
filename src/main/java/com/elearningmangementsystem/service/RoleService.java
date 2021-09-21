package com.elearningmangementsystem.service;

import com.elearningmangementsystem.model.Role;
import com.elearningmangementsystem.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRole() {
        List<Role>roles = roleRepository.findAll();
        return roles;
    }

    public Optional<Role> getRole(Integer id) {
       return roleRepository.findById(id);
    }

    public void addRole(Role role) {
        roleRepository.save(role);
    }
}
