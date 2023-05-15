package org.sunbeam.test;
class Employee{	//class Employee extends Object {
	private String name;
	private int empid;
	private String department;
	private String designation;
	private float salary;
	
	public Employee() {
		this( null, 0, null, null, 0.0f );
	}
	public Employee(String name, int empid, String department, String designation, float salary) {
		this.name = name;
		this.empid = empid;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}
	
	public void printRecord( ) {
		System.out.println("Name		:	"+this.name);
		System.out.println("Empid		:	"+this.empid);
		System.out.println("Department	:	"+this.department);
		System.out.println("Designation	:	"+this.designation);
		System.out.println("Salary		:	"+this.salary);
	}
//	//Employee this = emp;
//	public String toString() {
//		return this.name+" "+this.empid +" "+this.department+" "+this.designation +" "+this.salary;
//	}
	
//	//Employee this = emp;
//	public String toString() {
//		return this.name+" "+this.empid+" "+this.salary;
//	}
	
//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
//	}
	
//	@Override
//	public String toString() {
//		String str = String.format( "%-20s%-5d%-10.2f", this.name, this.empid, salary );
//		return str;
//	}
	
	@Override
	public String toString() {
		return String.format( "%-20s%-5d%-10.2f", this.name, this.empid, this.salary );
	}
}
public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee("Sandeep",33, "TCT", "Technical Head", 25000.50f );
		System.out.println(emp);//Sandeep 33 TCT Technical Head 25000.5
		//System.out.println(String.valueOf(emp));//Sandeep 33 TCT Technical Head 25000.5
	}
	public static void main2(String[] args) {
		Employee emp = new Employee("Sandeep",33, "TCT", "Technical Head", 25000.50f );
		System.out.println(emp.toString());//Sandeep 33 TCT Technical Head 25000.5
	}
	public static void main1(String[] args) {
		Employee emp = new Employee("Sandeep",33, "TCT", "Technical Head", 25000.50f );
		String str = emp.toString(); 
		System.out.println(str);//Sandeep 33 TCT Technical Head 25000.5
	}
}
