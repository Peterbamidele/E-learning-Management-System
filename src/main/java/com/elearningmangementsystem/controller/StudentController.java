package com.elearningmangementsystem.controller;

import com.elearningmangementsystem.model.Student;
import com.elearningmangementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("/student/{id}")
    public Optional<Student> getStudent(@PathVariable Integer id){
        return studentService.getStudent(id);
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
         studentService.addStudent(student);
    }

    @PutMapping("/students/{id}")
    public void updateStudent(@RequestBody Student student, @PathVariable Integer id){
        studentService.UpdateStudent(id, student);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(Integer id){
        studentService.deleteStudent(id);
    }


}
