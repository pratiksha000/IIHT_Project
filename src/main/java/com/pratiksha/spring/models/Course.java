package com.pratiksha.spring.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name ;
	private String description;
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (!(o instanceof Course)) return false;
	    Course course = (Course) o;
	    return Objects.equals(name, course.name);
	    		
	}
	@Override
	public int hashCode() {
	    return Objects.hash(id);
	}
	@Override
	public String toString() {
	    return "Course{" +
	            "id=" + id +
	            ", name='" + name + '\'' +
	            ", desc='" + description + '\'' +
	            '}';
	}
}
