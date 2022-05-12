package com.springboot.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.api.entity.Employee;
import com.springboot.api.repository.EmployeeRepository;
import com.springboot.api.service.EmployeeService;
import com.springboot.api.service.impl.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService emplyeeService = new EmployeeServiceImpl();
	
	@PostMapping("addemployees")
	public Employee saveEmployee(@RequestBody Employee employee){
		return emplyeeService.saveEmployee(employee);
	}
	
	@GetMapping("{id}")
	public Employee getEmployeeById(@PathVariable("id") long employeeId){
		return emplyeeService.getEmployeeById(employeeId);
	}
	
}
