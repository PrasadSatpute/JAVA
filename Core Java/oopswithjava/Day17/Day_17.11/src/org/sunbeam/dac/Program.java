package org.sunbeam.dac;
class Employee{
	int empid;
	public Employee(int empid) {
		this.empid = empid;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		return result;
	}
}
public class Program {
	public static void main(String[] args) {
		Employee e1 = new Employee(10);
		System.out.println(e1.hashCode());
		
		Employee e2 = new Employee(10);
		System.out.println(e2.hashCode());
	}		
}
