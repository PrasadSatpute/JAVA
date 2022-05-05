package com.springboot.api.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.api.entity.Employee;
import com.springboot.api.repository.EmployeeRepository;
import com.springboot.api.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository emplyeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository emplyeeRepository) {
		super();
		this.emplyeeRepository = emplyeeRepository;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return emplyeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmplyees() {
		return emplyeeRepository.findAll();
	}
	
}
