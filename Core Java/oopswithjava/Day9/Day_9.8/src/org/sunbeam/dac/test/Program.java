package org.sunbeam.dac.test;
class Person{
	String name;	
	int age;		
	
	public Person() {
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showRecord() {
		System.out.println("Name	:	"+this.name);
		System.out.println("Age	:	"+this.age);
	}
	
	public static void f1( ) {
		System.out.println("Super class f1");
	}
}

class Employee extends Person{ 	
	int empid;		
	float salary;	
	public Employee() {
	}
	public Employee(String name, int age, int empid, float salary) {
		this.empid = empid;
		this.salary = salary;
	}
	public void displayRecord() {
		this.showRecord();
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
	public static void f2( ) {
		System.out.println("Super class f2");
	}
}
public class Program {
	public static void main(String[] args) {
		Person.f2();	//Not OK
		//Employee.f2();	//OK
	}
	public static void main1(String[] args) {
		Person.f1(); //OK
		Employee.f1( );	//OK
	}
}
