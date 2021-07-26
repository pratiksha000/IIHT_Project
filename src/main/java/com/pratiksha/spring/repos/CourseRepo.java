package com.pratiksha.spring.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratiksha.spring.models.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
