package org.sunbeam.test;

public class Employee implements Comparable<Employee>{
	private String name;
	private int empid;
	private float salary;
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
//	@Override
//	public int compareTo(Employee other) {
//		if( this.empid < other.empid )
//			return -1;
//		if( this.empid > other.empid )
//			return 1;
//		return 0;
//	}
//	@Override
//	public int compareTo(Employee other) {
//		return this.empid - other.empid;
//	}
	
//	@Override
//	public int compareTo(Employee other) {
//		return this.name.compareTo(other.name);
//	}
	@Override
	public int compareTo(Employee other) {
		return (int) (this.salary - other.salary);
	}
	@Override
	public String toString() {
		return String.format("%-20s%-5d%-10.2f", this.name, this.empid, this.salary);
	}
}
