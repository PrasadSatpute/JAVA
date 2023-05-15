package org.sunbeam.test;
class Employee{	//class Employee extends Object {
	private String name;
	private int empid;
	private String department;
	private String designation;
	private float salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int empid, String department, String designation, float salary) {
		this.name = name;
		this.empid = empid;
		this.department = department;
		this.designation = designation;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
}
public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Object;
	}
}
