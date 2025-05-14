package com.enrollment.studentscourse.services;

import com.enrollment.studentscourse.entities.Course;
import com.enrollment.studentscourse.entities.Student;
import com.enrollment.studentscourse.entities.dto.CourseOutputDTO;
import com.enrollment.studentscourse.entities.dto.StudentOutputDTO;
import com.enrollment.studentscourse.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents (){
        List <Student> studentList = (List <Student>) studentRepository.findAll();
        return studentList;
      /*  return studentList.stream()
                .map(student->{
                    List<CourseOutputDTO> courses= student.getCourseList().stream()
                            .map(course->  new CourseOutputDTO(course.getId(), course.getCourseName()))
                            .toList();
                    return new StudentOutputDTO(student.getId(), student.getName(), courses);
                }).collect(Collectors.toList());*/
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

}
