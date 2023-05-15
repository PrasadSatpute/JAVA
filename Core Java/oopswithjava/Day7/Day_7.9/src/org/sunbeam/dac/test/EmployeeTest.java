package org.sunbeam.dac.test;

import java.util.Objects;
import java.util.Scanner;

import org.sunbeam.dac.model.Employee;

public class EmployeeTest {
	private static Scanner sc = new Scanner(System.in);
	private Employee emp;
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	/* public void acceptRecord( ) {
		if( this.emp != null ) {
			System.out.print("Name	:	");
			sc.nextLine();
			emp.setName(sc.nextLine());
			System.out.print("Empid	:	");
			emp.setEmpid(sc.nextInt());
			System.out.print("Salary	:	");
			emp.setSalary(sc.nextFloat());
		}
	}*/
	
	public void acceptRecord( ) {
		this.emp = Objects.requireNonNull(this.emp, "Employee instance is required.");
		System.out.print("Name	:	");
		sc.nextLine();
		emp.setName(sc.nextLine());
		System.out.print("Empid	:	");
		emp.setEmpid(sc.nextInt());
		System.out.print("Salary	:	");
		emp.setSalary(sc.nextFloat());
	}
	/* public void printRecord( ) {
		if( this.emp != null )
			System.out.println(emp.toString());
	} */
	
	public void printRecord( ) {
		this.emp = Objects.requireNonNull(this.emp, "Employee instance is required.");
		System.out.println(emp.toString());
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Print Record");
		System.out.print("Enter choice	:	");
		return sc.nextInt( );
	}
	public static void close( ) {
		sc.close();
	}
}
