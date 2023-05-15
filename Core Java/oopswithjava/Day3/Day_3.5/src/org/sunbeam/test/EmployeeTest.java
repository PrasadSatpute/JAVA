package org.sunbeam.test;

import java.util.Scanner;

public class EmployeeTest{
	private Employee emp = new Employee();	//OK
	
	public void acceptRecord( ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name	:	");
		emp.setName( sc.nextLine() );
		System.out.print("Empid	:	");
		emp.setEmpid( sc.nextInt() );
		System.out.print("Salary	:	");
		emp.setSalary( sc.nextFloat() );
	}
	
	public void printRecord( ) {
		System.out.println("Name	:	" + emp.getName());
		System.out.println("Empid	:	" + emp.getEmpid());
		System.out.println("Salary	:	" + emp.getSalary());
	}
}
