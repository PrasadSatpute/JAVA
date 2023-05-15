package org.sunbeam.dac.test;

class A extends RuntimeException{ }
class B extends RuntimeException{ }
class C extends RuntimeException{ }
class D extends RuntimeException{ }

class Person{
	public void print( ) throws A, B, C{
		System.out.println("Person.print");
	}
}
class Employee extends Person{
	@Override
	public void print( ) throws A, B, C, D { //OK
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
