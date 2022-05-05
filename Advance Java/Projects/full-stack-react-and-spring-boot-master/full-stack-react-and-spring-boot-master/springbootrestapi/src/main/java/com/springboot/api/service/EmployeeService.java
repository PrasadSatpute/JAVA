package com.springboot.api.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.api.entity.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmplyees();
	
	
	public List<Employee> getAllEmployees();
	
	
	public Employee getEmployeeById(Long id);
	
	
	public Employee saveEmployeeDetails(Employee employee);
	
	
	public Employee updateEmployee(Employee employee);
	
	
	public ResponseEntity<HttpStatus> deleteEmployeeById(Long id);
}
