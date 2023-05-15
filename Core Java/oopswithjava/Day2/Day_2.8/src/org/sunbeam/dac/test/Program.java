package org.sunbeam.dac.test;

import java.util.Scanner;
class Date{
	int day;	
	int month;	
	int year;	
	
	void acceptRecord( /*Date this*/ ) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Day	:	");
		//day = sc.nextInt();
		this.day = sc.nextInt();
		System.out.print("Month	:	");
		//month = sc.nextInt();
		this.month = sc.nextInt();
		System.out.print("Year	:	");
		//year = sc.nextInt();
		this.year = sc.nextInt();
	}
	
	void printRecord( /*Date this*/ ) {
		//System.out.println("Date	:	"+day+" / "+month+" / "+year);
		System.out.println("Date	:	"+this.day+" / "+this.month+" / "+this.year);
	}
}
public class Program {
	public static void main2(String[] args) {
		Date birthDate = new Date( );
		birthDate.acceptRecord();	//birthDate.acceptRecord( birthDate );
		birthDate.printRecord();	//birthDate.printRecord( birthDate );
	}
	public static void main(String[] args) {
		Date birthDate = new Date( );
		birthDate.acceptRecord();	//birthDate.acceptRecord( birthDate );
		
		Date joinDate = new Date();
		joinDate.acceptRecord();	//joinDate.acceptRecord( joinDate );
		
		
		birthDate.printRecord();
		joinDate.printRecord();
	}
}