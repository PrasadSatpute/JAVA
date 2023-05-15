package org.sunbeam.dac.test;

class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class Employee extends Person{
	private int empid;
	private float salary;
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
}
public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Sandeep");
		emp.setAge(33);
		emp.setEmpid(33);
		emp.setSalary(45000.50f);
		
		System.out.println("Name	:	"+emp.getName());
		System.out.println("Age	:	"+emp.getAge());
		System.out.println("Empid	:	"+emp.getEmpid());
		System.out.println("Salary	:	"+emp.getSalary());
	}
	public static void main1(String[] args) {
		Person p = new Person( );
		p.setName("Sandeep");
		p.setAge(37);
	
		System.out.println("Name	:	"+p.getName());
		System.out.println("Age	:	"+p.getAge());
	}
}
