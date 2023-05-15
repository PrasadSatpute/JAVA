package org.sunbeam.dac.test;

import java.util.Scanner;

public class Program {
	public static Employee[] getEmployees( ) {
		Employee[] arr = new Employee[ 5 ];
		for( int index = 0; index < arr.length; ++ index )
			arr[ index ] = new Employee();
		return arr;
	}
	private static Scanner sc = new Scanner(System.in);
	public static void acceptRecord( Employee emp ) {
		System.out.print("Name	:	");
		sc.nextLine();
		emp.setName(sc.nextLine());
		System.out.print("Empid	:	");
		emp.setEmpid(sc.nextInt());
		System.out.print("Salary	:	");
		emp.setSalary(sc.nextFloat());
	}
	private static void acceptRecord(Employee[] arr) {
		for( int index = 0; index < arr.length; ++ index ) 
			Program.acceptRecord(arr[ index ] );
	}
	private static void printRecord(Employee emp) {
		System.out.println(emp.toString());
	}
	private static void printRecord(Employee[] arr) {
		for( Employee emp : arr )
			Program.printRecord(emp);
	}
	public static void main(String[] args) {
		Employee[] arr = Program.getEmployees();
		
		Program.acceptRecord( arr );
		
		Program.printRecord( arr );
	}
}
