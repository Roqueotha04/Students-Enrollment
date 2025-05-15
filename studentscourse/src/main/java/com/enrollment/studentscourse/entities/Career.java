package com.enrollment.studentscourse.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Career {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String carrerName;

    @ManyToOne
    @JoinColumn(name = "field_id")
    private List <Field> fieldList;
}
