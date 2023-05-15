package org.sunbeam.dac.test;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try( Scanner sc = new Scanner(System.in);){	//try with resource
			System.out.print("Num1	:	");
			int num1 = sc.nextInt();
			
			System.out.print("Num2	:	");
			int num2 = sc.nextInt();
			
			if( num2 == 0 )
				throw new ArithmeticException("Divide by zero exception");
			int result = num1 / num2;	//ArithmeticException
			System.out.println("Result	:	"+result);			
		}catch( ArithmeticException ex) {
			ex.printStackTrace();
		}
	}
}
