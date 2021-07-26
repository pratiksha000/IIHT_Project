package com.pratiksha.spring.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratiksha.spring.models.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
