package com.elearningmangementsystem.controller;

import com.elearningmangementsystem.model.Role;
import com.elearningmangementsystem.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping ("/roles")
    public List<Role> getAllRole(){
        return roleService.getAllRole();
    }

    @GetMapping("/roles/{id}")
    public Optional<Role> getRole(@PathVariable Integer id){
        return roleService.getRole(id);
    }

    @PostMapping("/roles")
    public void addRole (@RequestBody Role role){
        roleService.addRole(role);
    }




}
