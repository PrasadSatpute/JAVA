package dac.assignment3.question2;

import java.util.Scanner;

class Employees
{
	
	Scanner sc = new  Scanner(System.in);
	
	String FirstName,LastName;
	double Salary;
	
	public Employees() {
		
		
		
		System.out.println("Enter The Information of Employee : ");
		System.out.println("Enter First Name : ");
		setFirstName(sc.nextLine());
		System.out.println("Enter Last Name : ");
		setLastName(sc.nextLine());
		System.out.println("Enter Salary : ");
		setSalary(sc.nextDouble());
		
	}
	
//	public Employees(String firstName, String lastName, double salary) {
//		super();
//		FirstName = firstName;
//		LastName = lastName;
//		Salary = salary;
//	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		if(salary >= 0)
		{
			Salary = salary * 12;
		}
	}

	public void printYearlySalary() {
		
		System.out.println("Yearly Salary");
		System.out.println("Name : "+FirstName+" "+LastName+" Salary : "+Salary);
		
	}

	public void raiseSalary() {
		
		System.out.println("Salary Raised by 10% of Employee "+getFirstName() );
		double RaisedSalary = (Salary * .10);
		setSalary(RaisedSalary);
	}
	
	
	
}

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		Employees emp1 = new Employees();
		emp1.printYearlySalary();
		
//		Employees emp2 = new Employees();
//		emp2.printYearlySalary();
		
		emp1.raiseSalary();
//		emp2.raiseSalary();
		
		emp1.printYearlySalary();
//		emp2.printYearlySalary();
		

	}

}
