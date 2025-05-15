package com.enrollment.studentscourse.repositories;

import com.enrollment.studentscourse.entities.Field;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldRepository extends CrudRepository <Field, Long> {

}
