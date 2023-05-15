package org.sunbeam.dac.test;

class Person{
	 String name;	
	 int age;		
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
	 int empid;		
	 float salary;	
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
		Person person = new Person();
		Employee emp = (Employee) person;	//Runtime Checking : ClassCastException
		
		//Employee e = new Person();	//Compile time checking // error
	}
	public static void main5(String[] args) {
		Person person = new Employee();	//Upcasting
		Employee emp = (Employee) person;	//Downcasting : OK
	}
	public static void main4(String[] args) {
		Person person = null;
		Employee emp = (Employee) person;	//Downcasting
		System.out.println(person);	//null
		System.out.println(emp);	//null
	}
	public static void main3(String[] args) {
		Person p = new Employee("Sandeep",37,33,45000.50f);	//Upcasting
		System.out.println("Name	:	"+p.name);	//OK
		System.out.println("Age	:	"+p.age);			//OK
		
		Employee emp = (Employee) p;	//Downcasting.
		System.out.println("Empid	:	"+emp.empid);	//OK
		System.out.println("Salary	:	"+emp.salary);	//OK
	}
	public static void main2(String[] args) {
		Employee emp = new Employee("Sandeep",37,33,45000.50f);
		//Person p = (Person)emp;	//Upcasting
		Person p = emp;	//Upcasting
		
		System.out.println("Name	:	"+p.name);	//OK
		System.out.println("Age	:	"+p.age);			//OK
		//System.out.println("Empid	:	"+p.empid);	//NOT OK
		//System.out.println("Salary	:	"+p.salary);	//NOT OK
	}
	public static void main1(String[] args) {
		Employee emp = new Employee("Sandeep",37,33,45000.50f);
		System.out.println("Name	:	"+emp.name);	//OK
		System.out.println("Age	:	"+emp.age);			//OK
		System.out.println("Empid	:	"+emp.empid);	//OK
		System.out.println("Salary	:	"+emp.salary);	//OK
	}
}
