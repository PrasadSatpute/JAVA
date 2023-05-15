package org.sunbeam.dac.test;

class Person{
	private String name;	//null
	private int age;		//0
	public Person(){
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showRecord( ) {
		System.out.println("Name	:	"+this.name);
		System.out.println("Age	:	"+this.age);
	}
}
class Employee extends Person{
	private int empid;		//0
	private float salary;	//0.0
	public Employee( ) {
	}
	public Employee(String name, int age, int empid, float salary) {
		super(name, age);
		this.empid = empid;
		this.salary = salary;
	}
	public void displayRecord( ) {
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
public class Program {
	public static void main(String[] args) {
		Person p1 = null;	//OK
		
		Person p2 = new Person( );	//OK
		
		Person p3 = new Employee();	//OK
		
		Employee e1 = null;	//OK
		
		Employee e2 = new Employee();	//OK
		
		Employee e3 = new Person();	//Not OK
	}
	public static void main6(String[] args) {
		Employee e1 = null;	//OK
		
		Employee e2 = new Employee( );	//OK
		
		//Employee e3 = new Person( );	//Not OK;
		
	}
	public static void main5(String[] args) {
		Person p1 = null;	//OK
		
		Person p2 = new Person( );	//OK
		
		Employee emp = new Employee();	//OK
		Person p3 = emp;	//OK
		
		Person p4 = new Employee();	//OK
	}
	public static void main4(String[] args) {
		Employee emp = new Employee("Sandeep",37,33,45000.50f);
		emp.showRecord();
		emp.displayRecord();
	}
	public static void main3(String[] args) {
		Employee emp = new Employee();
		emp.showRecord();
		emp.displayRecord();
	}
	public static void main2(String[] args) {
		Person p = new Person("ABC", 23);
		p.showRecord();
	}
	public static void main1(String[] args) {
		Person p = new Person();
		p.showRecord();
	}
}
