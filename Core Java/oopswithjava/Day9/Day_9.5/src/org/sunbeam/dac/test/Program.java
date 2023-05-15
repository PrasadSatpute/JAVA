package org.sunbeam.dac.test;
//Parent class / Super class
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
//Child class / Sub class
class Employee extends Person{ 
	//String name;	
	//int age;		
	int empid;		
	float salary;	
	public Employee() {
	}
	public Employee(String name, int age, int empid, float salary) {
		//this.name = name;
		//this.age = age;
		this.empid = empid;
		this.salary = salary;
	}
	public void displayRecord() {
		//System.out.println("Name	:	"+this.name);
		//System.out.println("Age	:	"+this.age);
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
public class Program {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Sandeep";
		p.age = 37;
		//p.empid = 33;		//Not OK
		//p.salary = 45000;	//Not OK
		
		System.out.println("Name	:	"+p.name);
		System.out.println("Age	:	"+p.age);
		//System.out.println("Empid	:	"+p.empid);
		//System.out.println("Salary	:	"+p.salary);
	}
	public static void main1(String[] args) {
		Employee emp = new Employee();
		emp.name = "Sandeep";	//OK
		emp.age = 37;			//OK
		emp.empid = 33;			//OK
		emp.salary = 45000;		//OK
		
		System.out.println("Name	:	"+emp.name);
		System.out.println("Age	:	"+emp.age);
		System.out.println("Empid	:	"+emp.empid);
		System.out.println("Salary	:	"+emp.salary);
	}
}
