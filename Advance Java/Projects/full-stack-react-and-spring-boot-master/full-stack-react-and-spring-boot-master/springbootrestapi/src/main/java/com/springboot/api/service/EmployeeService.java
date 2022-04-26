package com.springboot.api.service;

import java.util.List;

import com.springboot.api.entity.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmplyees();
}
