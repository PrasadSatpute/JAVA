package org.sunbeam.dac.test;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = null;	//Local
		
		try{
			System.out.println("Inside try block");
			sc = new Scanner(System.in);
			
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();
			
			System.out.print("Num2	:	");
			int num2 = sc.nextInt();
			
			if( num2 == 0 )
				throw new ArithmeticException("Divide by zero exception");
			int result = num1 / num2;	//ArithmeticException
			System.out.println("Result	:	"+result);
			System.exit(0);
			
		}catch( ArithmeticException ex) {
			System.out.println("Inside catch block");
			ex.printStackTrace();
			System.exit(0);
		}finally {
			System.out.println("Inside finally block");
			sc.close();
		}
	}
	public static void main3(String[] args) {
		Scanner sc = null;	//Local
		
		try{
			System.out.println("Inside try block");
			sc = new Scanner(System.in);
			
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();
			
			System.out.print("Num2	:	");
			int num2 = sc.nextInt();
			
			if( num2 == 0 )
				throw new ArithmeticException("Divide by zero exception");
			int result = num1 / num2;	//ArithmeticException
			System.out.println("Result	:	"+result);
			
		}catch( ArithmeticException ex) {
			System.out.println("Inside catch block");
			ex.printStackTrace();
		}finally {
			System.out.println("Inside finally block");
			sc.close();
		}
	}
	public static void main2(String[] args) {
		Scanner sc = null;
		
		try{
			sc = new Scanner(System.in);
			
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();
			
			System.out.print("Num2	:	");
			int num2 = sc.nextInt();
			
			if( num2 == 0 )
				throw new ArithmeticException("Divide by zero exception");
			else {
				int result = num1 / num2;	//ArithmeticException
				System.out.println("Result	:	"+result);
			}
			
		}catch( ArithmeticException ex) { 
			ex.printStackTrace();
		}
		sc.close();
	}
	public static void main1(String[] args) {
		Scanner sc = null;
		
		try{
			sc = new Scanner(System.in);
			
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();
			
			System.out.print("Num2	:	");
			int num2 = sc.nextInt();
			
			if( num2 == 0 ){
				ArithmeticException ex = new ArithmeticException("Divide by zero exception");
				throw ex;
			}else {
				int result = num1 / num2;	//ArithmeticException
				System.out.println("Result	:	"+result);
			}
			
		}catch( ArithmeticException ex) { 
			ex.printStackTrace();
		}
		sc.close();
	}
}
