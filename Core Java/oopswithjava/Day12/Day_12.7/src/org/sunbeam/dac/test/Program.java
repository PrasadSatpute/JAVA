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
			
			int result = num1 / num2;	//ArithmeticException
			System.out.println("Result	:	"+result);
		}catch( ArithmeticException ex) { 
			ex.printStackTrace();
		}catch( RuntimeException ex) { 
			ex.printStackTrace();
		}catch( Exception ex) { 
			ex.printStackTrace();
		}
		sc.close();
	}
}
