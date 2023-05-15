package org.sunbeam.dac.test;
class Date{
	private int day;	//0
	private int month;	//0
	private int year;	//0
	public Date() {
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
class Employee{
	private String name;	//null	//Association
	private int empid;		//0
	private float salary;	//0.0
	private Date joinDate;	//null	//Association
	public Employee() {
		this.name = new String( );
		this.joinDate = new Date( );
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
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
}
public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Sandeep");
		emp.setEmpid(33);
		emp.setSalary(45000.50f);
		Date joinDate = new Date( 26,12,2006);
		emp.setJoinDate( joinDate );
		
		
		System.out.println("Name	:	"+emp.getName());
		System.out.println("Empid	:	"+emp.getEmpid());
		System.out.println("Salary	:	"+emp.getSalary());
		joinDate = emp.getJoinDate();
		String strJoinDate = joinDate.getDay()+" / "+joinDate.getMonth()+" / "+joinDate.getYear();
		System.out.println("Join Date	:	"+strJoinDate);
	}
}
