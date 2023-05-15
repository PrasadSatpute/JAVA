package org.sunbeam.dac.test;

import java.util.Scanner;

//int day, month, year	:	Date

//int hour, minute, second	:	Time

//int xPosition, yPosition	:	Point

//double real, imag	:	Complex

//String name; int rollNumber;  float marks	:	Student

//int number; String type, float balance	:	Account 

/*
 class ClassName{
 	//Nested Type : Interface, class, enum
 	//Field
 	//Constructor
 	//Method
 }
 */

//Requirement
//Write a program to accept and print date

//class = { fields + methods }
class Date{
	int day;	//Field / property / attribute
	int month;	//Field / property / attribute
	int year;	//Field / property / attribute
	
	void acceptRecord( ) {	//Method / Operation / Behavior / Message
		Scanner sc = new Scanner(System.in);
		System.out.print("Day	:	");
		day = sc.nextInt();
		System.out.print("Month	:	");
		month = sc.nextInt();
		System.out.print("Year	:	");
		year = sc.nextInt();
	}
	void printRecord( ) {
		System.out.println("Date	:	"+day+" / "+month+" / "+year);
	}
}
public class Program {
	public static void main(String[] args) {
		
		Date dt = new Date( );

		//Method Call : Message Passing
		dt.acceptRecord( );	//acceptRecord() method is called on dt
		
		//Method Call : Message Passing
		dt.printRecord( );	//printRecord() method is called on dt
		
	}
	public static void main3(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Date dt = new Date( );

		System.out.print("Day	:	");
		dt.day = sc.nextInt();
		System.out.print("Month	:	");
		dt.month = sc.nextInt();
		System.out.print("Year	:	");
		dt.year = sc.nextInt();
		
		System.out.println("Date	:	"+dt.day+" / "+dt.month+" / "+dt.year);
	}
	public static void main2(String[] args) {
		Date dt = new Date( );
		
		dt.day = 25;
		dt.month = 5;
		dt.year = 2021;
		
		//System.out.println("Date	:	"+dt.day+" / "+dt.month+" / "+dt.year);
		System.out.println("Day	:	"+dt.day);
		System.out.println("Month	:	"+dt.month);
		System.out.println("Year	:	"+dt.year);
	}
	public static void main1(String[] args) {
		//new Date( );	//Annonymous Instance
		
		Date dt;	//Object reference
		dt = new Date( );
	}
}