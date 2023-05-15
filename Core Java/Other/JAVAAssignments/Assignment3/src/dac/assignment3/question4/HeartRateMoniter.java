package dac.assignment3.question4;

import java.util.Calendar;
import java.util.Scanner;

class HeartMoniter
{
	Scanner sc = new Scanner(System.in);
	
	public String FirstNmae,LastName;
	public int date, month, year;
	
	public HeartMoniter() {
		
		System.out.println("Enter First Name : ");
		setFirstNmae(sc.nextLine());
		System.out.println("Enter Last Name : ");
		setLastName(sc.nextLine());
		System.out.println("Enter Date of Birth :");
		System.out.println("Day :");
		setDate(sc.nextInt());
		System.out.println("Month :");
		setMonth(sc.nextInt());
		System.out.println("Year :");
		setYear(sc.nextInt());
	}

	public String getFirstNmae() {
		return FirstNmae;
	}

	public void setFirstNmae(String firstNmae) {
		FirstNmae = firstNmae;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
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

	public int calculateAge() {
		
		Calendar calendar = Calendar.getInstance();
		
		int currentMonth = calendar.get(Calendar.MONTH) + 1;
		int currentYear = calendar.get(Calendar.YEAR);
		
		if(currentMonth < this.month)
		{
			return ((currentYear -1) - this.year);
		}
		else
		{
			return (currentYear - this.year);
		}
		
	}

	public int calculateMaximumHeartRate() {
		
		return 220 - calculateAge();
		
	}

	public double calculateTargetHeartRate() {
		
		if(calculateAge() >= 50)
		{
			return (220 - calculateAge()) * 0.76;
		}
		else
		{
			return (220 - calculateAge()) * 0.93;
		}
		
	}
	
	
	
	
	
}

public class HeartRateMoniter {

	public static void main(String[] args) {
		
		HeartMoniter HM = new HeartMoniter();
		
		int PersonAge = HM.calculateAge();
		
		System.out.println("Age : "+PersonAge);
		
		System.out.println("Maximum Heart Rate : "+HM.calculateMaximumHeartRate());
		
		System.out.println("Target Heart Rate : "+HM.calculateTargetHeartRate());
		

	}

}
