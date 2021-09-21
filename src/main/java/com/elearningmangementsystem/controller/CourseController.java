package com.elearningmangementsystem.controller;

import com.elearningmangementsystem.model.Course;
import com.elearningmangementsystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }

    @GetMapping("/coureses/{id}")
    public Optional<Course> getCourse(@PathVariable Integer id){
        return courseService.getCourse(id);
    }

    @PostMapping("/courses")
    public void addCourse(@RequestBody Course course){
        courseService.allCourse(course);
    }

    @PutMapping("/course/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable Integer id){
        courseService.updateCourse(course, id);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable Integer id){
        courseService.deleteCourse(id);
    }



    }


