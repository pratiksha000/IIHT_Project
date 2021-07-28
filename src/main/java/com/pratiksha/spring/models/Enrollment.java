package com.pratiksha.spring.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Enrollment {

	@Id
	private int student_id;
	private int course_id;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
}
