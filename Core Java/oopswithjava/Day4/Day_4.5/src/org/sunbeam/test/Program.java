package org.sunbeam.test;
public class Program {
	private static float sum(int num1, float num2) {	//2 parameters
		return num1 + num2;	
	}
	private static float sum(float num1, int num2) { //2 parameters
		return num1 + num2;
	}
	public static void main(String[] args) {	
		float result = 0;
		result = Program.sum( 10, 20.5f );
		System.out.println("Result	:	"+result);
		
		result = Program.sum( 10.1f, 20 );
		System.out.println("Result	:	"+result);
	}
}
