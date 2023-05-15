package org.sunbeam.dac.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = null;
		
		try{//try block/handler
			sc = new Scanner(System.in);
			
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();
			
			System.out.print("Num2	:	");
			int num2 = sc.nextInt();
			
			int result = num1 / num2;
			System.out.println("Result	:	"+result);
		}catch( ArithmeticException | InputMismatchException ex) { //Multi-Catch block
			System.out.println(ex.getClass().getSimpleName());
		}
		sc.close();
	}
	public static void main2(String[] args) {
		Scanner sc = null;
		
		try{//try block/handler
			sc = new Scanner(System.in);
			
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();
			
			System.out.print("Num2	:	");
			int num2 = sc.nextInt();
			
			int result = num1 / num2;
			System.out.println("Result	:	"+result);
		}catch( ArithmeticException ex ) {
			System.out.println(ex.getClass().getSimpleName());
			//ex.printStackTrace();
		}catch( InputMismatchException ex ) {
			System.out.println(ex.getClass().getSimpleName());
			//ex.printStackTrace();
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
		
		try{//try block/handler
			int result = num1 / num2;
			System.out.println("Result	:	"+result);
		}catch( ArithmeticException ex ) {
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		sc.close();
	}
}
