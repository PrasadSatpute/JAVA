package org.sunbeam.function.test;

@FunctionalInterface
interface Supplier {
	Employee get( );
}
public class Program {
	public static void main(String[] args) {
		Supplier s = Employee::new;	//Constructor reference : Default ctor
		
		Employee emp = s.get( );	//0 arguments
		
		System.out.println(emp.toString());
	}
	public static void main3(String[] args) {
		Supplier s = ( )-> new Employee("Sandeep", 33, 45000.50f);
		
		Employee emp = s.get();
		
		System.out.println(emp.toString());
	}
	public static void main2(String[] args) {
		Supplier s = ( )->{
			return new Employee("Sandeep", 33, 45000.50f);
		};
		
		Employee emp = s.get();
		System.out.println(emp.toString());
	}
	public static void main1(String[] args) {
		Supplier s = ( )->{
			Employee emp = new Employee("Sandeep", 33, 45000.50f);
			return emp;
		};
		
		Employee emp = s.get();
		System.out.println(emp.toString());
	}
}
