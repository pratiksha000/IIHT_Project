package com.pratiksha.spring.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
@Id
private int id;
private String firstname;
private String lastname;
private String username;
private String password;
private String email_id;
private String address;
private long contact;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Student)) return false;
    Student student = (Student) o;
    return Objects.equals(username, student.username)&&
    		Objects.equals(password,student.password);
}
@Override
public int hashCode() {
    return Objects.hash(id, username, password
                        );
}
@Override
public String toString() {
    return "Student{" +
            "id=" + id +
             ",firstname='" + firstname + '\'' +
              ",lastname='" + lastname + '\'' +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            '}';
}
}
