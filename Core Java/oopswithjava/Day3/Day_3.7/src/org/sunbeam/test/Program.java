package org.sunbeam.test;
class Date{
	private int day;
	private int month;
	private int year;
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
/* class Employee{
	private int empid;			//Instance variable	-> 0
	private Date joinDate;		//Instance variable -> null
	public void printRecord( ) {
		System.out.println("Empid		:	"+this.empid);	//0
		System.out.println("JoinDate	:	"+this.joinDate);//null
		System.out.println(this.joinDate.getDay()+" / "+this.joinDate.getMonth()+" / "+this.joinDate.getYear());//NullPointerException
	}
} */
class Employee{
	private int empid;			//Instance variable	-> 0
	private Date joinDate = new Date();		//Instance variable -> 
}
public class Program {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = emp1;
	}
	public static void main2(String[] args) {
		Employee emp = new Employee( );
		//Employee emp;	//Local reference variable	//Java Stack
		//new Employee( );	//Instance of class Employee	//Heap
	}
	public static void main1(String[] args) {
		int number;
		Date joinDate = new Date( );
		//Date joinDate;	//Local Reference Variable 	=> Java Stack
		//new Date( );		//Instance of Date class	=> Heap
	}
}
