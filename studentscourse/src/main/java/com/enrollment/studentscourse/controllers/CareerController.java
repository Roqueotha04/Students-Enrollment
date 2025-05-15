package com.enrollment.studentscourse.controllers;

import com.enrollment.studentscourse.entities.Career;
import com.enrollment.studentscourse.services.CareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CareerController {

    @Autowired
    CareerService careerService;

    @PostMapping
    public Career addCarrer(@RequestBody Career career){
        return careerService.addCareer(career);
    }

    @GetMapping
    public List<Career> getAllCareers(){
        return careerService.getAllCareers();
    }



}
