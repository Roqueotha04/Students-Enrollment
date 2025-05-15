package com.enrollment.studentscourse.repositories;

import com.enrollment.studentscourse.entities.Career;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CareerRepository extends CrudRepository<Career, Long> {


}
