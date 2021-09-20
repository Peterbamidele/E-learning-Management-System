package com.elearningmangementsystem.repository;

import com.elearningmangementsystem.model.Duration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DurationRepository extends JpaRepository<Duration, Integer> {
}
