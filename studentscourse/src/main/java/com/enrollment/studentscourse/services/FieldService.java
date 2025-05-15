package com.enrollment.studentscourse.services;

import com.enrollment.studentscourse.entities.Field;
import com.enrollment.studentscourse.repositories.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldService {

    @Autowired
    FieldRepository fieldRepository;

    public List<Field> getAllFields (){
        return (List<Field>) fieldRepository.findAll();
    }

    public Field addField(Field field){
        return fieldRepository.save(field);
    }
}
