package com.elearningmangementsystem.service;

import com.elearningmangementsystem.model.Course;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    List<Course> getAllCourse();
    Optional<Course> getCourse(Integer id);
    void allCourse(Course course);
    void updateCourse(Course course, Integer id);
    void deleteCourse(Integer id);
}
