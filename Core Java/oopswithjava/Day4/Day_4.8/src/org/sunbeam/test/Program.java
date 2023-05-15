package org.sunbeam.test;
public class Program {
	public static int sum( int num1, int num2 ) {
		int result = num1 + num2;
		return result;
	}	
	public static void main(String[] args) {	
		int result = sum( 10, 20 );	//OK
		System.out.println("Result	:	"+result);
		
		sum( 50, 60 );	//OK
	}
}
