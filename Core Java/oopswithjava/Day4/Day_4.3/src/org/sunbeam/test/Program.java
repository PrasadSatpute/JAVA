package org.sunbeam.test;
public class Program {
	private static int sum(int num1, int num2) {	//2 parameters
		return num1 + num2;	
	}
	private static int sum(int num1, int num2, int num3) { //3 parameters
		return num1 + num2 + num3;
	}
	public static void main(String[] args) {	
		int result = 0;
		result = Program.sum( 10, 20 );
		System.out.println("Result	:	"+result);
		
		result = Program.sum( 10, 20, 30 );
		System.out.println("Result	:	"+result);
	}
}
