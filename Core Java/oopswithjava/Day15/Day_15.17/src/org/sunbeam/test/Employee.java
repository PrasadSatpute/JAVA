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
	
	public String getName() {
		return this.name;
	}

	public int getEmpid() {
		return this.empid;
	}

	public float getSalary() {
		return this.salary;
	}
	@Override
	public int compareTo(Employee other) {
		return this.empid - other.empid;
	}
	@Override
	public String toString() {
		return String.format("%-20s%-5d%-10.2f", this.name, this.empid, this.salary);
	}
}
