package com.elearningmangementsystem.controller;

import com.elearningmangementsystem.model.Permission;
import com.elearningmangementsystem.repository.PermissionRepository;
import com.elearningmangementsystem.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class PernissionController {

    @Autowired
    private PermissionService permissionService;

    @GetMapping("/permissions")
    public List <Permission> getAllPermission(){
        return permissionService.getAllPermission();
    }

    @GetMapping("/permmissons/{id}")
    public Optional<Permission> getPermission(@PathVariable Integer id){
        return permissionService.getPermission(id);
    }

    @PostMapping("/permissions")
    public void addPermission(@RequestBody Permission permission){
        permissionService.addPermission(permission);
    }

    @PutMapping("/permission/{id}")
    public void updatePermission(@RequestBody Permission permission, @PathVariable Integer id){
        permissionService.updatePermission(permission, id);
    }

    @DeleteMapping("/permission/{id}")
    public void deletePermission(@PathVariable Integer id){
        permissionService.deletePermission(id);
    }

}
