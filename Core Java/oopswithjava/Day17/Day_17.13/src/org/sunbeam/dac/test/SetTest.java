package org.sunbeam.dac.test;
import java.util.Set;

import org.sunbeam.dac.exceptions.EmployeeNotFoundException;
import org.sunbeam.dac.model.Employee;

public class SetTest {
	private Set<Employee> empList;
	public void setEmpList(Set<Employee> empList) {
		this.empList = empList;
	}
	
	public void addElement(Employee[] arr) {
		if( this.empList != null ) {
			for( Employee emp : arr )
				empList.add(emp);	//OK
		}
	}
	
	public Employee findElement(int empid) throws EmployeeNotFoundException {
		if( this.empList != null ) {
			for( Employee emp : this.empList ) {
				if( emp.getEmpid() == empid )
					return emp;
			}
		}
		throw new EmployeeNotFoundException("Invalid empid.");
	} 
	
	public boolean removeElement(int empid) throws EmployeeNotFoundException {
		if( this.empList != null ) {
			Employee key = new Employee();
			key.setEmpid(empid);
			if( empList.contains(key)) {
				this.empList.remove(key);	//OK
				return true;
			}
		}
		throw new EmployeeNotFoundException("Invalid empid.");
	}	
	
	public void printList( ) {
		if( this.empList != null ) {
			for( Employee emp : this.empList )
				System.out.println(emp.toString());	
		}
	}
}
