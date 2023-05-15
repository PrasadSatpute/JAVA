package org.sunbeam.test;
class Employee{	//class Employee extends Object {
	private String name;
	private int empid;
	private String department;
	private String designation;
	private float salary;
	
	public Employee() {
		this( null, 0, null, null, 0.0f );
	}
	public Employee(String name, int empid, String department, String designation, float salary) {
		this.name = name;
		this.empid = empid;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}
	
	public void printRecord( ) {
		System.out.println("Name		:	"+this.name);
		System.out.println("Empid		:	"+this.empid);
		System.out.println("Department	:	"+this.department);
		System.out.println("Designation	:	"+this.designation);
		System.out.println("Salary		:	"+this.salary);
	}
}
public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee("Sandeep",33, "TCT", "Technical Head", 25000.50f );
		String str = emp.toString(); //Object.toString( ) is called
		System.out.println(str);//org.sunbeam.test.Employee@6d06d69c
	}
	public static void main2(String[] args) {
		Employee emp = new Employee("Sandeep",33, "TCT", "Technical Head", 25000.50f );
		emp.printRecord();
	}
	public static void main1(String[] args) {
		Employee emp = new Employee();
		emp.printRecord();
	}
}
