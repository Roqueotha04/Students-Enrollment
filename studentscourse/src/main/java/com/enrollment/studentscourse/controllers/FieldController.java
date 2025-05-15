package com.enrollment.studentscourse.controllers;

import com.enrollment.studentscourse.entities.Field;
import com.enrollment.studentscourse.services.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/field")
public class FieldController {
    @Autowired
    FieldService fieldService;

    @GetMapping
    public List<Field> getCourses(){
        return fieldService.getAllFields();
    }

    @PostMapping
    public Field addCourse(@RequestBody Field field){
        return fieldService.addField(field);
    }
}
