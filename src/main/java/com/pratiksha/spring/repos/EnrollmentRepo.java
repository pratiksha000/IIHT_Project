package com.pratiksha.spring.repos;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pratiksha.spring.models.Enrollment;

@Repository
public interface EnrollmentRepo extends JpaRepository<Enrollment, Integer> {

	
	@Modifying
	@Query(value = "insert into Enrollment (student_id, course_id) VALUES (:s_id,:c_id)", nativeQuery = true)
	@Transactional
	void enroll(@Param("s_id") int s_id,@Param("c_id")int c_id);
}
