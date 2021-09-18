package com.elearningmangementsystem.repository;

import com.elearningmangementsystem.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Integer> {
}
