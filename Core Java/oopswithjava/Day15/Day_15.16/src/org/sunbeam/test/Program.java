package org.sunbeam.test;

import java.util.Arrays;

public class Program {
	private static Employee[] getEmployees() {
		Employee[] arr = new Employee[ 5 ];
		arr[ 0 ] = new Employee("Shubham", 15, 15000);
		arr[ 1 ] = new Employee("Yogesh", 12, 20000);
		arr[ 2 ] = new Employee("Rahul", 14, 25000);
		arr[ 3 ] = new Employee("Umesh", 11, 10000);
		arr[ 4 ] = new Employee("Amit", 13, 30000);
		return arr;
	}
	private static void printRecord(Employee[] arr) {
		for (Employee emp : arr) 
			System.out.println(emp.toString());
		System.out.println();
	}
	public static void main(String[] args) {
		Employee[] arr = Program.getEmployees( );
		Program.printRecord( arr );
		
		Arrays.sort(arr);	//mergesort
		
		Program.printRecord( arr );
	}
	

}
