package org.sunbeam.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);
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
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Sort by name");
		System.out.println("2.Sort by empid");
		System.out.println("3.Sort by salary");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		Employee[] arr = Program.getEmployees( );
		while( ( choice = Program.menuList( ) ) != 0 ) {
			Comparator<Employee> comparator = null;
			switch( choice ) {
			case 1:
				comparator = new SortByName();		//Upcasting
				break;
			case 2:
				comparator = new SortByEmpId();		//Upcasting 
				break;
			case 3:
				comparator = new SortBySalary();	//Upcasting
				break;
			}
			Arrays.sort(arr, comparator);
			Program.printRecord(arr);
		}
	}
}
