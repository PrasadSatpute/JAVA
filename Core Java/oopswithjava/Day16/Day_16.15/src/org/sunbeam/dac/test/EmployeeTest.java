package org.sunbeam.dac.test;

import java.util.Scanner;

import org.sunbeam.dac.model.Employee;

public class EmployeeTest {
	private Employee employee;
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public void acceptRecord( ) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("Name	:	");
			this.employee.setName( sc.nextLine());
			System.out.print("Empid	:	");
			this.employee.setEmpid(sc.nextInt());
			System.out.print("Salary	:	");
			this.employee.setSalary(sc.nextFloat());
		}
	}
	public void printRecord( ) {
		System.out.println(employee.toString());
	}
}
