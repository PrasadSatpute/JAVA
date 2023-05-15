package org.sunbeam.test;

class Employee{ 
	//Fields / Instance variable
	private String name;	//null
	private int empid;		//0
	private float salary;	//0.0
	
	//Non static method / instance method
	void printRecord( ) {
		System.out.println("Name	:	"+this.name);
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
public class Program {
	public static void main(String[] args) {
		Employee emp = null;	//null reference variable / null object
		emp = new Employee();	//To avoid NullPointerException
		emp.printRecord( );		//Ok
	}
	public static void main4(String[] args) {
		Employee emp = null;	//null reference variable / null object
		emp.printRecord( );		//NullPointerException
	}
	public static void main3(String[] args) {
		Employee emp = new Employee( );	//Initialization of emp
		emp.printRecord( );	//OK
	}
	public static void main2(String[] args) {
		Employee emp;	//Reference
		emp = new Employee( );	//Assignment of emp
		emp.printRecord( );	//OK
	}
	public static void main1(String[] args) {
		//Employee emp;	//Reference
		//emp.printRecord( );	//Error : The local variable emp may not have been initialized
	}
}
