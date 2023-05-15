package org.sunbeam.function.test;

@FunctionalInterface
interface Supplier {
	String get( Employee emp );	//Functional Method
}
public class Program {
	public static void main(String[] args) {
		Supplier s =  Employee::getName;
		
		Employee emp = new Employee("Sandeep", 33, 45000.50f );
		
		String name = s.get(emp);
		
		System.out.println("Name	:	"+name);
	}
	public static void main3(String[] args) {
		
		Supplier s = emp  -> emp.getName();
		
		Employee emp = new Employee("Sandeep", 33, 45000.50f );
		
		String name = s.get(emp);
		
		System.out.println("Name	:	"+name);
	}
	public static void main2(String[] args) {
		
		Supplier s = ( emp ) -> emp.getName();
		
		Employee emp = new Employee("Sandeep", 33, 45000.50f );
		
		String name = s.get(emp);
		
		System.out.println("Name	:	"+name);
	}
	public static void main1(String[] args) {
		
		Supplier s = ( Employee emp ) -> emp.getName();
		
		Employee emp = new Employee("Sandeep", 33, 45000.50f );
		
		String name = s.get(emp);
		
		System.out.println("Name	:	"+name);
	}
}
