package com.springboot.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.api.entity.Employee;
import com.springboot.api.repository.EmployeeRepository;
import com.springboot.api.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository emplyeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return emplyeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmplyees() {
		return emplyeeRepository.findAll();
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		return emplyeeRepository.findAll();
	}
	
	@Override
	public Employee getEmployeeById(@PathVariable Long id) {
		return emplyeeRepository.findById(id).get();
	}
	
	@Override
	public Employee saveEmployeeDetails(@RequestBody Employee employee) {
		return emplyeeRepository.save(employee);
	}
	
	@Override
	public Employee updateEmployee(@RequestBody Employee employee) {
		return emplyeeRepository.save(employee);
	}
	
	@Override
	public ResponseEntity<HttpStatus> deleteEmployeeById(@PathVariable Long id) {
		emplyeeRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
