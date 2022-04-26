package com.springboot.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.api.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}
