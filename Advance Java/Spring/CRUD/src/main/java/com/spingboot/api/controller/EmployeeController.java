package com.spingboot.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spingboot.api.model.Employee;
import com.springboot.api.service.EmployeeService;

@RestController
@RequestMapping()
public class EmployeeController {

	@Autowired
	public EmployeeService employeeService;
	
	
	//GET ALL EMPLOYEE API
	@GetMapping("getallemployees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	//CREATE EMPLOYEE REST API
	@PostMapping("addemployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmplyee(employee), HttpStatus.CREATED);
	}
	
	//http://localhost:8181/api/employee/1
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(id), HttpStatus.OK);
	}
	
}
