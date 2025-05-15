package com.enrollment.studentscourse.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data

public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fieldName;
    @OneToMany(mappedBy = "field")
    //@JsonIgnoreProperties("courseList")
    private List<Course> courseList;

    @OneToMany (mappedBy = "fieldList")
    private Career career;
}
