package org.sunbeam.dac.test;
enum Day{
	SUN( 1, "SunDay" ), MON ( 2, "MonDay" ), TUES( 3, "TuesDay" );
	private int dayNumber;
	private String dayName;
	private Day( int dayNumber, String dayName ) {
		this.dayNumber = dayNumber;
		this.dayName = dayName;
	}
	public String getDayName() {
		return dayName;
	}
	public int getDayNumber() {
		return dayNumber;
	}
}
public class Program {
	public static void main(String[] args) {
		Day day = Day.SUN;
		System.out.println(day.name()+"	"+day.ordinal()+"	"+day.getDayName()+"	"+day.getDayNumber());
	}	
}
