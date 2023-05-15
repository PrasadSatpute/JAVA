package org.sunbeam.dac.test;

interface Printable{
	void print( );
}
enum Day implements Printable{
	SUN( 1, "SunDay" ), MON ( 2 ), TUES( "TuesDay" );
	private int dayNumber;
	private String dayName;
	private Day( int dayNumber, String dayName ) {
		this.dayNumber = dayNumber;
		this.dayName = dayName;
	}
	private Day( int dayNumber) {
		this.dayNumber = dayNumber;
	}
	private Day(String dayName ) {
		this.dayName = dayName;
	}
	public String getDayName() {
		return dayName;
	}
	public int getDayNumber() {
		return dayNumber;
	}
	@Override
	public void print() {
		System.out.printf("%-10s%-3d%-10s%-3d\n", this.name(), this.ordinal(), this.getDayName(), this.getDayNumber());
	}
}
public class Program {
	public static void main(String[] args) {
		Day[] days = Day.values();
		for (Day day : days) {
			day.print();
		}
	}	
}
