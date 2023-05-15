package org.sunbeam.test;
public class Program {
	private static int sum(int num1, int num2) {	//2 parameters
		return num1 + num2;	
	}
	private static double sum(int num1, double num2) { //2 parameters
		return num1 + num2;
	}
	public static void main(String[] args) {	
		//int result = 0;
		int result1 = Program.sum( 10, 20 );
		System.out.println("Result	:	"+result1);
		
		double result2 = Program.sum( 10, 20.5d );
		System.out.println("Result	:	"+result2);
	}
}
