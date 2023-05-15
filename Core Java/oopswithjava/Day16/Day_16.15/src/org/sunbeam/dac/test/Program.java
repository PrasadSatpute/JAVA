package org.sunbeam.dac.test;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import org.sunbeam.dac.exceptions.EmployeeNotFoundException;
import org.sunbeam.dac.model.Employee;
import org.sunbeam.dac.model.SortByEmpid;
import org.sunbeam.dac.model.SortByName;
import org.sunbeam.dac.model.SortBySalary;

public class Program {
	private static Scanner sc = new Scanner(System.in);

	private static void acceptRecord(int[] empid) {
		System.out.print("Enter empid	:	");
		empid[0] = sc.nextInt();
	}
	private static void printRecord(Employee value) {
		if( value != null )
			System.out.println(value.toString());
		else
			System.out.println("Employee not found");
	}
	private static void printRecord(boolean removedStatus) {
		if( removedStatus)
			System.out.println("Employee is removed");
		else
			System.out.println("Employee not found");
	}
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add Element");
		System.out.println("2.Find Element");
		System.out.println("3.Remove Element");
		System.out.println("4.Print Element(s)[ Sorted ]");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static int subMenuList() {
		System.out.println("0.Exit");
		System.out.println("1.Sort By Name");
		System.out.println("2.Sort By Empid");
		System.out.println("3.Sort By Salary");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		int[] key = new int[1];
		ListTest test = new ListTest();
		EmployeeTest etest = new EmployeeTest();
		test.setEmpList(new ArrayList<Employee>());
		while ((choice = Program.menuList()) != 0) {
			try {
				switch (choice) {
				case 1:
					Employee emp = new Employee();
					etest.setEmployee(emp);
					etest.acceptRecord();
					test.addElement(emp);
					break;
				case 2:
					Program.acceptRecord(key);
					Employee value = test.findElement( key[ 0 ] );
					Program.printRecord( value );
					break;
				case 3:
					Program.acceptRecord(key);
					boolean removedStatus = test.removeElement( key[ 0 ] );
					Program.printRecord(removedStatus );
					break;
				case 4:
					while( ( choice = Program.subMenuList( ) ) != 0 ) {
						Comparator<Employee> comparator = null;
						switch( choice ) {
						case 1:
							comparator = new SortByName();
							break;
						case 2:
							comparator = new SortByEmpid();
							break;
						case 3:
							comparator = new SortBySalary();
							break;
						}
						test.printList( comparator );
					}
					break;
				}
			} catch (EmployeeNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
