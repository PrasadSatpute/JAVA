package org.sunbeam.test;

import java.util.Scanner;

class Employee{	//Step 1 : Define class
	//Step no 2  : Declare fields 
	String name;
	int empid;
	float salary;
	//Step no 5 : Define method inside class
	void acceptRecord( /* Employee this */ ) {	//this is method parameter. It gets space once per method call
		//Step no 6 : using this, access fields inside method
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Name	:	");
		this.name = sc.nextLine();
		
		System.out.print("Empid	:	");
		this.empid = sc.nextInt();
		
		System.out.print("Salary	:	");
		this.salary = sc.nextFloat();
	}
	void printRecord( /* Employee this */) {
		System.out.println("Name	:	"+this.name);
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
public class Program {
	public static void main(String[] args) {
		//Step no 3: Instantiate class
		Employee emp = new Employee();
		//Step no 4: to read/write data inside instance, we should call method on instance
		//acceptRecord( ) method is called on emp;
		emp.acceptRecord( );	//emp.acceptRecord( emp );
		
		//printRecord( ) method is called on emp;
		emp.printRecord( );	//emp.printRecord( emp );
	}
	
	public static void main1(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		emp1.acceptRecord();	//emp1.acceptRecord(emp1);
		emp2.acceptRecord();	//emp2.acceptRecord(emp2);
		emp3.acceptRecord();	//emp3.acceptRecord(emp3);
	}
}
