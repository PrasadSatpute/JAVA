package dac.assignment3.question3;

import java.util.Scanner;

class DATE
{
	Scanner sc = new Scanner(System.in);
	
	int Day,month,year;
	
	public DATE() {
		super();
		
		
		
		System.out.println("Enter Day :");
		setDay(sc.nextInt());
		System.out.println("Enter Month :");
		setMonth(sc.nextInt());
		System.out.println("Enter Year :");
		setYear(sc.nextInt());
		
	}

	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		Day = day;
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

	public void displayDate() {
		
		System.out.println(month+" / "+Day+" / "+year);
		
	}
	
	
}

public class DateFormat {

	public static void main(String[] args) {
		
		DATE date = new DATE();
		date.displayDate();

	}

}
