package org.sunbeam.dac.test;

import org.sunbeam.dac.model.Person;

//Dac Student
class Employee extends Person{
	private int empid;
	private float salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, int empid, float salary) {
		super(name, age);
		this.empid = empid;
		this.salary = salary;
	}
	public void printRecord() {
		super.printRecord();
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
public class Program {	//Client : SunBeam
	public static void main(String[] args) {
		 Employee emp = new Employee("Sandeep", 37, 33, 45000.50f);
		 emp.printRecord();
	}
}
