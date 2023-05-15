package org.sunbeam.dac.test;
enum Day{
	SUN( "SunDay" ), MON ( "MonDay" ), TUES( "TuesDay" );
	private String dayName;
	private Day( String dayName ) {
		this.dayName = dayName;
	}
	public String getDayName() {
		return dayName;
	}
}
public class Program {
	public static void main(String[] args) {
		Day day = Day.SUN;
		System.out.println(day.name()+"	"+day.ordinal()+"	"+day.getDayName());
	}	
}
