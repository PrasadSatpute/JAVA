package com.spingboot.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spingboot.api.exception.ResourceNotFoundException;
import com.spingboot.api.model.Employee;
import com.spingboot.api.repository.EmployeeRepository;
import com.springboot.api.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	public EmployeeRepository employeeRepo;
	
	@Override
	public Employee saveEmplyee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Optional<Employee> employee = employeeRepo.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}
		else {
			throw new ResourceNotFoundException("Employee", "ID", id);
		}
		
//		return employeeRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "ID", id));
		
	}
	
}
