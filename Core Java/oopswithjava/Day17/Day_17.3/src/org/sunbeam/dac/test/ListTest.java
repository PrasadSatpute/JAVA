package org.sunbeam.dac.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.sunbeam.dac.exceptions.EmployeeNotFoundException;
import org.sunbeam.dac.model.Employee;

public class ListTest {
	private List<Employee> empList;
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	public void addElement(Employee[] arr) {
		if( this.empList != null ) {
			for( Employee emp : arr ) {
				empList.add(emp);
			}
		}
	}
	public Employee findElement(int empid) throws EmployeeNotFoundException {
		if( this.empList != null ) {
			Employee key = new Employee();
			key.setEmpid(empid);
			if( empList.contains(key)) {
				int index = this.empList.indexOf(key);
				Employee value =  this.empList.get(index);
				return value;
			}
		}
		throw new EmployeeNotFoundException("Invalid empid.");
	} 
	public boolean removeElement(int empid) throws EmployeeNotFoundException {
		if( this.empList != null ) {
			Employee key = new Employee();
			key.setEmpid(empid);
			if( empList.contains(key)) {
				this.empList.remove(key);
				return true;
			}
		}
		throw new EmployeeNotFoundException("Invalid empid.");
	}	
	public void printList(Comparator<Employee> comparator) {
		if( this.empList != null ) {
			this.empList.sort(comparator);
			for( Employee emp : this.empList )
				System.out.println(emp.toString());	
		}
	}
}
