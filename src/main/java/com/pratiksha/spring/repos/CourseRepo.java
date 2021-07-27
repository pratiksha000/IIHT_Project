package com.pratiksha.spring.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pratiksha.spring.models.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

	/*
	 * @Modifying
	 * 
	 * @Query("update Course u set u.name = :name && u.description=:description where u.id = :id"
	 * ) void updateCourse(@Param(value = "id") int id, @Param(value = "name")
	 * String name,@Param(value="description")String description);
	 */

	/*
	 * @Query("select u from Course u where u.id = :id") Course
	 * findCourseById(@Param(value = "id") int id);
	 */
}
