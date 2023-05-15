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
}
public class Program {
	public static void main(String[] args) {
		Person p = new Person();
		p.showRecord();		//OK
		p.displayRecord( );	//NOT OK
	}
	public static void main2(String[] args) {
		Employee emp = new Employee();
		emp.displayRecord( );
	}
	public static void main1(String[] args) {
		Employee emp = new Employee();
		emp.showRecord();	//OK
		emp.displayRecord( );	//OK
	}
}
