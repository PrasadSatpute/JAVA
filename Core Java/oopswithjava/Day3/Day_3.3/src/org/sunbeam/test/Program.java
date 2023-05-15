package org.sunbeam.test;

import java.util.Scanner;

class Employee {
	// Fields
	private String name;
	private int empid;
	private float salary;
	
	//Inspector/Selector/getter methods
	public String getName() {
		return this.name;
	}
	public int getEmpid() {
		return this.empid;
	}
	public float getSalary() {
		return this.salary;
	}
	
	//Modifier / getter methods
	public void setName(String name) {
		this.name = name;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}

public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Name	:	");
		emp.setName( sc.nextLine() );
		System.out.print("Empid	:	");
		emp.setEmpid( sc.nextInt() );
		System.out.print("Salary	:	");
		emp.setSalary( sc.nextFloat() );

		System.out.println("Name	:	" + emp.getName());
		System.out.println("Empid	:	" + emp.getEmpid());
		System.out.println("Salary	:	" + emp.getSalary());
	}
	public static void main1(String[] args) {
		Employee emp = new Employee();
		emp.setName("Sandeep");
		emp.setEmpid(33);
		emp.setSalary(50000);

		// String name = emp.getName();
		System.out.println("Name	:	" + emp.getName());
		System.out.println("Empid	:	" + emp.getEmpid());
		System.out.println("Salary	:	" + emp.getSalary());
	}
}
