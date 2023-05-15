package org.sunbeam.dac.test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = null;
		sc = new Scanner(System.in);
		
		System.out.print("Num1	:	");
		int num1 = sc.nextInt();
		
		System.out.print("Num2	:	");
		int num2 = sc.nextInt();
		try( Scanner sc1 = new Scanner(System.in) ) {//try block/handler
			int result = num1 / num2;
			System.out.println("Result	:	"+result);
		}
	}
	public static void main3(String[] args) {
		Scanner sc = null;
		sc = new Scanner(System.in);
		
		System.out.print("Num1	:	");
		int num1 = sc.nextInt();
		
		System.out.print("Num2	:	");
		int num2 = sc.nextInt();
		try {//try block/handler
			int result = num1 / num2;
			System.out.println("Result	:	"+result);
		} finally {
			sc.close();	
		}
	}
	public static void main2(String[] args) {
		Scanner sc = null;
		sc = new Scanner(System.in);
		
		System.out.print("Num1	:	");
		int num1 = sc.nextInt();
		
		System.out.print("Num2	:	");
		int num2 = sc.nextInt();
		try {//try block/handler
			int result = num1 / num2;
			System.out.println("Result	:	"+result);
		} catch( ArithmeticException ex ) {
			System.out.println(ex.getMessage());
		}
		sc.close();
	}
	public static void main1(String[] args) {
		Scanner sc = null;
		sc = new Scanner(System.in);
		
		System.out.print("Num1	:	");
		int num1 = sc.nextInt();
		
		System.out.print("Num2	:	");
		int num2 = sc.nextInt();
		try {//try block/handler
			int result = num1 / num2;
			System.out.println("Result	:	"+result);
		} //Error
		sc.close();
	}
}
