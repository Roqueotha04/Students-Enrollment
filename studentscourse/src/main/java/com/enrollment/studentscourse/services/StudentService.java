package com.enrollment.studentscourse.services;

import com.enrollment.studentscourse.entities.Student;
import com.enrollment.studentscourse.entities.dto.CourseOutputDTO;
import com.enrollment.studentscourse.entities.dto.StudentOutputDTO;
import com.enrollment.studentscourse.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<StudentOutputDTO> getAllStudents (){
        List <Student> studentList = (List <Student>) studentRepository.findAll();

        return studentList.stream().
                map(student-> {
                    List<CourseOutputDTO> courses = student.getCourseList().stream().
                            map(course -> new CourseOutputDTO(course.getField().getId(), course.getField().getFieldName()))
                            .toList();
                    return new StudentOutputDTO(student.getId(), student.getName(), courses);
                }).toList();

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
