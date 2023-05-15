package practice.array.examples;

import java.util.Scanner;

enum Day{
	//SUN = 1, MON = 2, TUES = 3;	//NOT OK
	SUN( 1 ), MON ( 2 ), TUES( 3 );
	private int dayNumber;
	private Day( int dayNumber ) {
		this.dayNumber = dayNumber;
	}
	public int getDayNumber() {
		return dayNumber;
	}
}
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Day day = Day.SUN;
		System.out.println(day.name()+"	"+day.ordinal()+"	"+day.getDayNumber());
	}	
}