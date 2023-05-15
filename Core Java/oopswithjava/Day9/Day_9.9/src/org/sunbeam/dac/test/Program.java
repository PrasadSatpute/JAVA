package org.sunbeam.dac.test;
class Person{
	public class Date{
		public void print( ) {
			System.out.println("02/06/2021");
		}
	}
}

class Employee extends Person{
	
}
public class Program {
	public static void main(String[] args) {
		Employee.Date dt2 = new Employee().new Date( );
		dt2.print();
	} 
	public static void main1(String[] args) {
		Person.Date dt1 = new Person().new Date( );
		dt1.print(); //OK
	}
}
