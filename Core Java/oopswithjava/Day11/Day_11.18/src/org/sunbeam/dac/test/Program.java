package org.sunbeam.dac.test;
class Employee extends Object{
	private String name;
	private int empid;
	private float salary;
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	
	//Employee this = emp1;
	//Object obj = emp2
	@Override
	public boolean equals(Object obj) {
		if( obj != null ) {
			Employee other = (Employee) obj;	//Downcasting
			if( this.empid == other.empid )
				return true;
		}
		return false;
	}
}
public class Program {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Sandeep", 33, 45000.50f);
		Employee emp2 = new Employee("Sandeep", 33, 45000.50f);
		//Employee emp2 = null;
		
		//public boolean equals(Object obj)
		if( emp1.equals(emp2) )	//OK : Object class's equals method will call.
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : 	Not Equal
	}
	public static void main2(String[] args) {
		Employee emp1 = new Employee("Sandeep", 33, 45000.50f);
		Employee emp2 = new Employee("Sandeep", 33, 45000.50f);
		if( emp1 == emp2 )	//OK
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : 	Not Equal
	}
	public static void main1(String[] args) {
		Employee emp1 = new Employee("Sandeep", 33, 45000.50f);
		Employee emp2 = emp1;
		if( emp1 == emp2 )	//OK
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : 	Equal
	}
}
