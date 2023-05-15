package org.sunbeam.function.test;

@FunctionalInterface
interface Supplier {
	Employee get( String name, int empid, float salary );
}
public class Program {
	public static void main(String[] args) {
		Supplier s = Employee::new;	//Constructor reference : Default ctor
		
		Employee emp = s.get( "Sandeep", 33, 45000.50f );	//0 arguments
		
		System.out.println(emp.toString());
	}
}
