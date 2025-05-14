package com.enrollment.studentscourse.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class studentCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Long studentId;

    @ManyToOne
    private Long courseId;


}
