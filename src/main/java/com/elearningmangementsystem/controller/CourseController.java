package com.elearningmangementsystem.controller;

import com.elearningmangementsystem.model.Course;
import com.elearningmangementsystem.service.serviceImpl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping ("/")
public class CourseController {

    @Autowired
    private CourseServiceImpl courseServiceImpl;

    @GetMapping("/")
    public List<Course> getAllCourse(){
        return courseServiceImpl.getAllCourse();
    }

    @GetMapping("/coureses/{id}")
    public Optional<Course> getCourse(@PathVariable Integer id){
        return courseServiceImpl.getCourse(id);
    }

    @PostMapping("/courses")
    public void addCourse(@RequestBody Course course){
        courseServiceImpl.allCourse(course);
    }

    @PutMapping("/course/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable Integer id){
        courseServiceImpl.updateCourse(course, id);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable Integer id){
        courseServiceImpl.deleteCourse(id);
    }



    }


