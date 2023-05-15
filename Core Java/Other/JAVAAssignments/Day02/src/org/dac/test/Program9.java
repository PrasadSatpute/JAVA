package org.dac.test;

class Date{
	//Data hiding / Data encapsulation
	private int day;	
	private int month;	
	private int year;	
	
	//Method
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


public class Program9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Date birthDate = new Date( );
		System.out.print("Day	:	");
		int day = sc.nextInt();
		birthDate.setDay( day );
		
		System.out.print("Month	:	");
		int month = sc.nextInt();
		birthDate.setMonth(month);
		
		System.out.print("Year	:	");
		int year = sc.nextInt(); 
		birthDate.setYear( year );
		
		System.out.println(birthDate.getDay()+" / "+birthDate.getMonth()+"	"+birthDate.getYear());
	}
	public static void main1(String[] args) {
		Date birthDate = new Date( );
		birthDate.setDay( 23 );
		birthDate.setMonth(7);
		birthDate.setYear(1983);
		
		System.out.println(birthDate.getDay()+" / "+birthDate.getMonth()+"	"+birthDate.getYear());
	}


}
