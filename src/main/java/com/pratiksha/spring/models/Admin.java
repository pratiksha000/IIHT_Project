package com.pratiksha.spring.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {
	
@Id
@GeneratedValue
private int id;
private String username;
private String password;
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
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Admin)) return false;
    Admin admin = (Admin) o;
    return Objects.equals(username, admin.username)&&
    		Objects.equals(password,admin.password);
}
@Override
public int hashCode() {
    return Objects.hash(id, username, password
                        );
}
@Override
public String toString() {
    return "Admin{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            '}';
}
}
