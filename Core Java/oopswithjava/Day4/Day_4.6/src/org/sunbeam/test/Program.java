package org.sunbeam.test;
public class Program {
	private static int sum(int num1, int num2) {	//OK
		return num1 + num2;	
	}
	private static void sum(int num1, int num2) { //Not OK
		int result = num1 + num2;
		System.out.println("Result	:	"+result);
	}
	public static void main(String[] args) {	
		int result = 0;
		result = Program.sum( 10, 20 );
		System.out.println("Result	:	"+result);
		
		Program.sum( 10, 20 );
		System.out.println("Result	:	"+result);
	}
}
