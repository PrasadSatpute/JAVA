package org.sunbeam.dac.test;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import org.sunbeam.dac.model.Employee;

class ArrayListTest {
	private ArrayList<Employee> empList = new ArrayList<Employee>();
	
	public void addElement(Employee[] arr) {
		for( Employee emp : arr ) {
			empList.add(emp);
		}
	}
	/* public Employee findElement(int empid) {
		for( Employee emp : this.empList ) {
			if( emp.getEmpid() == empid )
				return emp;
		}
		return null;
	} */
	public Employee findElement(int empid) {
		Employee key = new Employee();
		key.setEmpid(empid);
		if( empList.contains(key)) {
			int index = this.empList.indexOf(key);
			Employee value =  this.empList.get(index);
			return value;
		}
		return null;
	} 
	
	/* public Employee findElement(int empid) {
		Employee key = new Employee( empid );
		if( empList.contains(key))
			return this.empList.get(this.empList.indexOf(key));
		return null;
	} */
	
	/* public boolean removeElement(int empid) {
		Employee key = new Employee();
		key.setEmpid(empid);
		if( empList.contains(key)) {
			int index = this.empList.indexOf(key);
			this.empList.remove(index);
			return true;
		}
		return false;
	} */
	public boolean removeElement(int empid) {
		Employee key = new Employee();
		key.setEmpid(empid);
		if( empList.contains(key)) {
			this.empList.remove(key);
			return true;
		}
		return false;
	}	
	public void printList() {
		for( Employee emp : this.empList )
			System.out.println(emp.toString());
	}
}

public class Program {
	private static Scanner sc = new Scanner(System.in);

	private static void acceptRecord(int[] empid) {
		System.out.print("Enter empid	:	");
		empid[0] = sc.nextInt();
	}

	public static Employee[] getEmployees() {
		Employee[] arr = new Employee[5];
		arr[0] = new Employee("Nitin", 13, 50000);
		arr[1] = new Employee("Amit", 10, 45000);
		arr[2] = new Employee("Sarang", 15, 40000);
		arr[3] = new Employee("Yogesh", 14, 25000);
		arr[4] = new Employee("Digvijay", 12, 30000);
		return arr;
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

	public static void main(String[] args) {
		int choice;
		int[] key = new int[1];
		ArrayListTest test = new ArrayListTest();
		while ((choice = Program.menuList()) != 0) {
			switch (choice) {
			case 1:
				Employee[] arr = Program.getEmployees();
				test.addElement( arr );
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
				test.printList( );
				break;
			}
		}
	}
}
