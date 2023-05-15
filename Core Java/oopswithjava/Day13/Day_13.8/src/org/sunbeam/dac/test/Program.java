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
	public void print( ) throws Exception {	//Not OK
		System.out.println("Employee.print");
	}
}
public class Program {
	public static void main(String[] args) {
		try {
			Person p = new Employee();
			p.print();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
