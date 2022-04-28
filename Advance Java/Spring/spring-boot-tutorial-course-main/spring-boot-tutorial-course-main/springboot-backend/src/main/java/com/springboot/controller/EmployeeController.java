package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Employee;
import com.springboot.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

//	public EmployeeController(EmployeeService employeeService) {
//		super();
//		this.employeeService = employeeService;
//	}
	
	// build create employee REST API
	@PostMapping("addemployee")
	public Employee saveEmployee(@RequestBody Employee employee){
		return employeeService.saveEmployee(employee);
	}
	
	// build create employee REST API
//	@PostMapping("addemployee")
//	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
//		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
//	}
	
	// build get all employees REST API
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	// build get employee by id REST API
		// http://localhost:8080/api/employees/1
		@GetMapping("{id}")
		public Employee getEmployeeById(@PathVariable("id") long employeeId){
			return employeeService.getEmployeeById(employeeId);
		}
	
	// build get employee by id REST API
	// http://localhost:8080/api/employees/1
//	@GetMapping("{id}")
//	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId){
//		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
//	}
		
		
		// build update employee REST API
		// http://localhost:8080/api/employees/1
		@PutMapping("{id}")
		public Employee updateEmployee(@PathVariable("id") long id
													  ,@RequestBody Employee employee){
			return employeeService.updateEmployee(employee, id);
		}
	
	// build update employee REST API
	// http://localhost:8080/api/employees/1
//	@PutMapping("{id}")
//	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id
//												  ,@RequestBody Employee employee){
//		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
//	}
		
	
		// build delete employee REST API
		// http://localhost:8080/api/employees/1
		@DeleteMapping("{id}")
		public String deleteEmployee(@PathVariable("id") long id){
			
			// delete employee from DB
			employeeService.deleteEmployee(id);
			
			return "Employee deleted successfully!.";
		}
		
	
	// build delete employee REST API
	// http://localhost:8080/api/employees/1
//	@DeleteMapping("{id}")
//	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
//		
//		// delete employee from DB
//		employeeService.deleteEmployee(id);
//		
//		return new ResponseEntity<String>("Employee deleted successfully!.", HttpStatus.OK);
//	}
	
	@GetMapping("getname/{name}")
	public List<Employee> getEmployeeByName(@PathVariable("name") String name){
		return employeeService.getEmployeeByName(name);
	}
	
}
