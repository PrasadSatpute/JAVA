package org.sunbeam.test;

public class Employee {
	// Fields
	private String name;
	private int empid;
	private float salary;
	
	//Inspector/Selector/getter methods
	public String getName() {
		return this.name;
	}
	public int getEmpid() {
		return this.empid;
	}
	public float getSalary() {
		return this.salary;
	}
	
	//Modifier / setter methods
	public void setName(String name) {
		this.name = name;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}
