package org.sunbeam.test;

import java.util.Scanner;

class Employee{ 
	//Fields
	private String name;
	private int empid;
	private float salary;
	//Methods
	void acceptRecord(  ) {	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Name	:	");
		this.name = sc.nextLine();
		
		System.out.print("Empid	:	");
		this.empid = sc.nextInt();
		
		System.out.print("Salary	:	");
		this.salary = sc.nextFloat();
	}
	//Employee this = emp;
	public void setSalary(float salary) {
		if( salary >= 8500 && salary <= 175000)
			this.salary = salary;
	}
	void printRecord( ) {
		System.out.println("Name	:	"+this.name);
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
public class Program {
	public static void main(String[] args) {
		//Instance
		Employee emp = new Employee();	//Instantiation
		
		//Method Call
		emp.acceptRecord( );	//Message Passing
	
		emp.setSalary( -45000 );	//emp.setSalary( emp, 45000 );
		
		//Method Call
		emp.printRecord( );	//Message Passing
	
	}
}
