package com.enrollment.studentscourse.entities.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class StudentOutputDTO {
    private Long id;
    private String name;
    private List<CourseOutputDTO> courseList;
}
