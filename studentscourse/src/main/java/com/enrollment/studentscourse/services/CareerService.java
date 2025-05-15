package com.enrollment.studentscourse.services;

import com.enrollment.studentscourse.entities.Career;
import com.enrollment.studentscourse.repositories.CareerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CareerService {
    @Autowired
    CareerRepository careerRepository;

    public Career addCareer (Career career){
        return careerRepository.save(career);
    }

    public List<Career> getAllCareers (){
        return (List<Career>) careerRepository.findAll();
    }
}
