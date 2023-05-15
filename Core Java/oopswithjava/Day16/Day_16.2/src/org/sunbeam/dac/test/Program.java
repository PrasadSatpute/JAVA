package org.sunbeam.dac.test;

import java.util.ArrayList;

class Date implements Cloneable {
	private int day;
	private int month;
	private int year;
	public Date() {
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
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
	//Date this = dt1
//	@Override
//	public Date clone( ) {
//		Date other = new Date( this.day, this.month, this.year);
//		return other;
//	}
//	@Override
//	public Date clone( ) throws CloneNotSupportedException {
//		Date other = (Date) super.clone();
//		return other;
//	}
	
	@Override
	public Date clone( )  {
		try {
			Date other = (Date) super.clone();
			return other;
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e);
		}
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}
public class Program {
	//protected Object clone()throws CloneNotSupportedException
	public static void main(String[] args) {
		Date dt1 = new Date( 10, 6, 2021 );
		Date dt2 = dt1.clone();	
		
		dt1.setDay(15);
		dt2.setMonth(7);
		
		System.out.println( dt1.toString() );
		System.out.println( dt2.toString() );
	}
	public static void main1(String[] args) {
		Date dt1 = new Date( 10, 6, 2021 );
		Date dt2 = dt1;	//Shallow Copy of references
		
		dt1.setDay(15);
		dt2.setMonth(7);
		
		System.out.println( dt1.toString() );
		System.out.println( dt2.toString() );
	}
}
