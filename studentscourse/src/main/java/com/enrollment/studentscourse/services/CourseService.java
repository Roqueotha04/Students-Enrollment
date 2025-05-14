package com.enrollment.studentscourse.services;

import com.enrollment.studentscourse.entities.Course;
import com.enrollment.studentscourse.entities.Student;
import com.enrollment.studentscourse.repositories.CourseRepository;
import com.enrollment.studentscourse.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourses (){
        return (List<Course>) courseRepository.findAll();
    }

    public Course addCourse(Course course){
        return courseRepository.save(course);
    }
}
