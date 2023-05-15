package org.sunbeam.dac.test;

public class Program {
	public static Employee[] getEmployees( ) {
		Employee[] arr = new Employee[ 5 ];
		arr[ 0 ] = new Employee("Rahul Kale",11,45000);
		arr[ 1 ] = new Employee("Sandeep Kulange",12,47000);
		arr[ 2 ] = new Employee("Nilesh Ghule",13,48000);
		arr[ 3 ] = new Employee("Amit Kulkarni",14,50000);
		arr[ 4 ] = new Employee("Prashant Lad",15,42000);
		return arr;
	}
	private static void printRecord(Employee[] arr) {
		for( Employee emp : arr )
			System.out.println( emp );
		System.out.println();
	}
	public static void main(String[] args) {
		Employee[] arr = Program.getEmployees();
		
		Program.printRecord( arr );
	}
}
