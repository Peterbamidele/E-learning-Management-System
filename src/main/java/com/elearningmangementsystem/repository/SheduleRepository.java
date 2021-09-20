package com.elearningmangementsystem.repository;

import com.elearningmangementsystem.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SheduleRepository extends JpaRepository<Schedule, Integer> {
}
