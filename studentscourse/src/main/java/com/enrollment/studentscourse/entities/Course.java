package com.enrollment.studentscourse.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String courseName;
    @ManyToMany(mappedBy = "courseList")
    //@JsonIgnoreProperties("courseList")
    private List<Student> studentList;
}
