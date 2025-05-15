package com.enrollment.studentscourse.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int score;

    @ManyToOne
    @JoinColumn(name = "student_mark")
    private Course course;

}
