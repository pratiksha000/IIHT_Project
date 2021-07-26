package com.pratiksha.spring.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pratiksha.spring.models.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

}
