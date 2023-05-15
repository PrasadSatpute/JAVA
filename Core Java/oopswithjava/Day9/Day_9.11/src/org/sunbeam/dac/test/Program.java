package org.sunbeam.dac.test;

class Person{
	private String name;	
	private int age;		
	public Person() {
		System.out.println("public Person()");
	}
	public Person(String name, int age) {
		System.out.println("public Person(String name, int age)");
		this.name = name;
		this.age = age;
	}
	public void showRecord() {
		System.out.println("Name	:	"+this.name);
		System.out.println("Age	:	"+this.age);
	}
}
class Employee extends Person{ 	
	private int empid;		
	private float salary;	
	public Employee() {
		System.out.println("public Employee()");
	}
	public Employee(String name, int age, int empid, float salary) {
		super( name, age );	//Constructor chaining
		System.out.println("public Employee(String name, int age, int empid, float salary)");
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
		Employee emp = new Employee( "Sandeep", 37, 33, 45000.50f );
		emp.displayRecord();
	}
	public static void main3(String[] args) {
		Employee emp = new Employee();
	}
	public static void main2(String[] args) {
		Person p = new Person("Sandeep",37);
	}
	public static void main1(String[] args) {
		Person p = new Person();
	}
}
