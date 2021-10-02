package com.elearningmangementsystem.service;

import com.elearningmangementsystem.model.Course;
import com.elearningmangementsystem.model.Duration;

import java.util.List;
import java.util.Optional;

public interface DurationService {
    List<Duration> getAllDuration();
    Optional<Duration> getDuration(Integer id);
    void addDuration(Duration duration);
    void updateDuration(Duration duration, Integer id);
    void deleteDuration(Integer id);
}
