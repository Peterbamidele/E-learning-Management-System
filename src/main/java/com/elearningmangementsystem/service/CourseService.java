package com.elearningmangementsystem.service;

import com.elearningmangementsystem.model.Course;
import com.elearningmangementsystem.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getAllCourse() {
        List<Course> courses = courseRepository.findAll();
        return courses;
    }

    public Optional<Course> getCourse(Integer id) {
       return courseRepository.findById(id);
    }

    public void allCourse(@RequestBody Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course, Integer id) {
        courseRepository.save(course);
    }

    public void deleteCourse(Integer id) {
        courseRepository.deleteById(id);
    }
}
