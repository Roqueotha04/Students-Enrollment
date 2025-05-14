package com.enrollment.studentscourse.repositories;

import com.enrollment.studentscourse.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository <Course, Long> {

}
