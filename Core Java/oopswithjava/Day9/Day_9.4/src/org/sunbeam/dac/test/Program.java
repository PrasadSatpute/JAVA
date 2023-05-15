package org.sunbeam.dac.test;

class Employee{
	String name;	//null
	int age;		//0
	int empid;		//0
	float salary;	//0.0
	public Employee() {
	}
	public Employee(String name, int age, int empid, float salary) {
		this.name = name;
		this.age = age;
		this.empid = empid;
		this.salary = salary;
	}
	public void displayRecord( /*Employee this = emp */) {
		System.out.println("Name	:	"+this.name);
		System.out.println("Age	:	"+this.age);
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee("Sandeep", 37, 33, 45000.50f );
		emp.displayRecord();
	}
	public static void main1(String[] args) {
		Employee emp = new Employee();
		emp.displayRecord();
	}
}
