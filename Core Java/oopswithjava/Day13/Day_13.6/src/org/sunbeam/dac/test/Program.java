package org.sunbeam.dac.test;

class A extends Exception{ }
class B extends Exception{ }
class C extends Exception{ }
class D extends Exception{ }

class Person{
	public void print( ) throws A, B, C{
		System.out.println("Person.print");
	}
}
class Employee extends Person{
	@Override
	//public void print( ) {	//OK
	//public void print( ) throws A  {	//OK
	//public void print( ) throws A, B{	//OK
	//public void print( ) throws A, B, C {	//OK
	public void print( ) throws A, B, C, D {	//Not OK
		System.out.println("Employee.print");
	}
}
public class Program {
	public static void main(String[] args) {
		try {
			Person p = new Employee();
			p.print();
		} catch (A | B | C e) {
			e.printStackTrace();
		}
	}
}
