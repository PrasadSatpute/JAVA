package org.sunbeam.dac.test;
public class Program {
	public static void main(String[] args) {
		double num1 = 10.5;
		int num2;
		num2 = (int)num1;	//Narrowing : OK
		System.out.println("Num2	:	"+num2);	//10
	}
	public static void main5(String[] args) {
		double num1 = 10.5;
		
		int num2 = (int)num1;	//Narrowing : OK
		System.out.println("Num2	:	"+num2);	//10
		
		//int num3 = num1;	//Narrowing : Not OK
		
	}
	public static void main4(String[] args) {
		double num1 = 10.5;
		double num2 = num1;
		System.out.println("Num2	:	"+num2);
	}
	public static void main3(String[] args) {
		int num1 = 10;
		
		double num2 = ( double )num1;	//Widening : OK
		System.out.println("Num2	:	"+num2);
		
		double num3 = num1;	//Widening : OK
		System.out.println("Num3	:	"+num3);
	}
	public static void main2(String[] args) {
		int num1 = 10;
		int num2 = num1;
		System.out.println("Num2	:	"+num2);
	}
	public static void main1(String[] args) {
		int num1;	//Uninitialized variable
		
		int num2 = 20;	//Initialized variable
		
		int num3;
		num3 = 30;	//Assignment
		
		int num4 = 40;		//Initialization
		int num5 = num4;	//Initialization
	}
}
