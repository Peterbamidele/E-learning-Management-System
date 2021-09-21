package com.elearningmangementsystem.service;

import com.elearningmangementsystem.model.Permission;
import com.elearningmangementsystem.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    public List<Permission> getAllPermission() {
        List<Permission> permissions = permissionRepository.findAll();
        return permissions;
    }

    public Optional<Permission> getPermission(Integer id) {
        return permissionRepository.findById(id);
    }

    public void addPermission(Permission permission) {
        permissionRepository.save(permission);
    }

    public void updatePermission(Permission permission, Integer id) {
        permissionRepository.save(permission);
    }

    public void deletePermission(Integer id) {
        permissionRepository.deleteById(id);
    }
}
