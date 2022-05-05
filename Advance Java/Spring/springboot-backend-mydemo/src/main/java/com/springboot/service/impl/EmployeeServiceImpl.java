package com.springboot.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRepository;
import com.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	//Constructor Base Repository
	@Autowired
	private EmployeeRepository employeeRepository;
	
//	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
//		super();
//		this.employeeRepository = employeeRepository;
//	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
//		Optional<Employee> employee = employeeRepository.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//		}else {
//			throw new ResourceNotFoundException("Employee", "Id", id);
//		}
		return employeeRepository.findById(id).get();
		
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {
		
		// we need to check whether employee with given id is exist in DB or not
		Employee existingEmployee = employeeRepository.findById(id).get(); 
		
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		// save existing employee to DB
		employeeRepository.save(existingEmployee);
		return existingEmployee;
	}

	@Override
	public String deleteEmployee(long id) {
		
		// check whether a employee exist in a DB or not
		if(employeeRepository.findById(id).get() != null) {
			employeeRepository.deleteById(id);
			return "Employee Deleted";
		}
		return "Employee Deleted";
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		
		List<Employee> employee = getAllEmployees();
		List<Employee> employee1 = new ArrayList<Employee>();
		
		for (Employee employee2 : employee) {
			if((employee2.getFirstName()).equalsIgnoreCase(name)) {
				employee1.add(employee2);
			}
		}
		return employee1;
		
	}
	
}
