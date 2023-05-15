package org.sunbeam.dac.test;

class Person{
	public void print(  int number ) {
		System.out.println("Person.print");
	}
}
class Employee extends Person{
	@Override
	public void print( int number ) {
		System.out.println("Employee.print");
	}	
}
public class Program {
	public static void main5(String[] args) {
		Person person = new Employee();
		Employee employee = (Employee) person;	//OK
	}
	public static void main(String[] args) {
		//Employee employee = new Person();	//Compiler error
	}
	public static void main3(String[] args) {
		Person person = new Person();
		Employee employee = (Employee) person;	//ClassCastException
	}
	public static void main2(String[] args) {
		Person person = null;
		Employee employee = (Employee) person;	//Downcasting
		System.out.println(person+"	"+employee);	//null	null
	}
	public static void main1(String[] args) {
		Person p = new Employee();
		p.print( 10 );
	}
}