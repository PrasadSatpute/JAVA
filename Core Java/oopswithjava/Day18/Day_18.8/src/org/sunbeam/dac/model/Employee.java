package org.sunbeam.dac.model;

import java.io.Serializable;

public class Employee implements Comparable<Employee>, Serializable {
	private static final long serialVersionUID = 6060688474222557531L;
	private String name;
	private int empid;
	private float salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid) {
		this.empid = empid;
	}
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public boolean equals(Object obj) {
		if( obj != null ) {
			Employee other = (Employee) obj;
			if( this.empid == other.empid )
				return true;
		}
		return false;
	}
	@Override
	public int compareTo(Employee other) {
		return this.empid - other.empid;
	}
	@Override
	public String toString() {
		return String.format("%-15s%-5d%-10.2f", this.name, this.empid, this.salary);
	}
}
