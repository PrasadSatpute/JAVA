package com.springboot.api.service;

import java.util.List;

import com.spingboot.api.model.Employee;

public interface EmployeeService {
	Employee saveEmplyee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(Long id);
}
