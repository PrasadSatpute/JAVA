package org.sunbeam.dac.test;
//Parent class / Super class
class Person{
	static int timePass = 100;
	
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
//Child class / Sub class
class Employee extends Person{ 	
	static int dhamDhum = 200;
	int empid;		
	float salary;	
	public Employee() {
	}
	public Employee(String name, int age, int empid, float salary) {
		this.empid = empid;
		this.salary = salary;
	}
	public void displayRecord() {
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
public class Program {
	public static void main(String[] args) {
		System.out.println(Person.dhamDhum);	//NOT OK
		System.out.println(Employee.dhamDhum);	//OK
	}
	public static void main1(String[] args) {
		System.out.println(Person.timePass);	//OK
		System.out.println(Employee.timePass);	//OK
	}
}
