package com.enrollment.studentscourse.controllers;

import com.enrollment.studentscourse.entities.Course;
import com.enrollment.studentscourse.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping
    public List<Course> getCourses(){
        return courseService.getAllCourses();
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }
}
