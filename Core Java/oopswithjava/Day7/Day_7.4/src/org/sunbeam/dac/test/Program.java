package org.sunbeam.dac.test;
/* Types of loop
 * 	1. do-while
 * 	2. while loop
 * 	3. for loop
 * 	4. foreach loop
 */

public class Program {
	public static void main(String[] args) {
		do {
			System.out.println("Good Morning!!");
		}while( true );	
		// <, >, <=, >=, ==, !=  are relational operator
		// &&, ||	are logical operators
	}
	public static void main4(String[] args) {
		int count = 1;	//Initialization
		do {
			System.out.println("Good Morning!!");
			count = count + 1;	//Increment
		}while( count <= 10 );	//Condition
	}
	public static void main3(String[] args) {
		System.out.println(10 < 10 );	//false
		System.out.println( 10 > 10 );	//false
	}
	public static void main2(String[] args) {
		System.out.println("Good Morning!!");
		System.out.println("Good Morning!!");
		System.out.println("Good Morning!!");
		System.out.println("Good Morning!!");
		System.out.println("Good Morning!!");
		System.out.println("Good Morning!!");
		System.out.println("Good Morning!!");
		System.out.println("Good Morning!!");
		System.out.println("Good Morning!!");
		System.out.println("Good Morning!!");
	}
	public static void main1(String[] args) {
		/*
			//do-while : exit constrolled loop
			//1. Initialization
			do {
				//TODO : Write business logic
				//2. Increment / decrement statement
			}while( condition )	;	//3. Condition
		*/
	}
}
