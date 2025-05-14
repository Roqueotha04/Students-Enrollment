package com.enrollment.studentscourse.controllers;

import com.enrollment.studentscourse.entities.Student;
import com.enrollment.studentscourse.entities.dto.StudentOutputDTO;
import com.enrollment.studentscourse.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> getStudents(){
       return studentService.getAllStudents();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
}
