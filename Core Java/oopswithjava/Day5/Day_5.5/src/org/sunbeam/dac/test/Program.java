package org.sunbeam.dac.test;

import java.io.IOException;
import java.util.Scanner;

class Test{
	private int num1;			//Non Static Field( also called instance variable )
	private int num2;			//Non Static Field( also called instance variable )
	private static int num3;	//Static Field( also called class level variable )
	static Scanner sc;
	//Static Initialization Block
	static {
		sc = new Scanner(System.in);
		System.out.println("Loading class Test");
		//num3 = 500;	//OK
		Test.num3 = 500;	//OK
	}
	public Test( ) {
		this(0,0);	//Constructor chaining
	}
	public Test(int num1, int num2) {	//parameterized constructor
		System.out.println("Inside Constructor");
		this.num1 = num1;
		this.num2 = num2;
	}
	//Concrete Method
	public void printRecord( /*Test this*/) {	//Non Static Method( also called as instance method )
		//System.out.println("Num1	:	"+Test.num1);	//Error
		System.out.println("Num1	:	"+this.num1);
		//System.out.println("Num1	:	"+Test.num2);	//Error
		System.out.println("Num2	:	"+this.num2);
		//System.out.println("Num3	:	"+this.num3);	//OK : The static field Test.num3 should be accessed in a static way
		System.out.println("Num3	:	"+Test.num3);	//OK 
		System.out.println("-----------------------------");
	}
		
}
public class Program {
	public static void main(String[] args) {

		Test t1 = new Test( 10, 20 );
		Test t2 = new Test( 30, 40 );
		Test t3 = new Test( 50, 60 );
		
		t1.printRecord( );	//t1.printRecord( t1 );
		t2.printRecord( );	//t2.printRecord( t2 );
		t3.printRecord( );	//t3.printRecord( t3 );
	}
}
