package org.sunbeam.dac.test;

class Calculator{
	public static double power( double base, int index ) {
		double result = 1;
		for( int count = 1; count <= index; ++ count )
			result = result * base;
		return result;
	}
}

public class Program {
	public static void main(String[] args) {
		double result = Calculator.power( 10.5d, 2);
		System.out.println("Result	:	"+result);
	}
}
