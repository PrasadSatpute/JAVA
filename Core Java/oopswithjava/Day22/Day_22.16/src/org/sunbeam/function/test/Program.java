package org.sunbeam.function.test;

@FunctionalInterface
interface IMath {
	int factorial( int number );	
}

public class Program {
	public static void main(String[] args) {
		IMath math = number -> {
			int result = 1;
			for( int count = 1; count <= number; ++ count )
				result = result * count;
			return result;
		};
		
		int result = math.factorial(5);
		System.out.println("Result	:	"+result);
	}
	public static void main2(String[] args) {
		IMath math = ( number ) -> {
			int result = 1;
			for( int count = 1; count <= number; ++ count )
				result = result * count;
			return result;
		};
		
		int result = math.factorial(5);
		System.out.println("Result	:	"+result);
	}
	public static void main1(String[] args) {
		IMath math = ( int number ) -> {
			int result = 1;
			for( int count = 1; count <= number; ++ count )
				result = result * count;
			return result;
		};
		
		int result = math.factorial(5);
		System.out.println("Result	:	"+result);
	}
}
