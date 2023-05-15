package org.sunbeam.function.test;

@FunctionalInterface
interface IMath {
	void sum( int num1, int num2 );	//Functional Method	
}

public class Program {
	public static void main(String[] args) {
		IMath math = ( num1, num2 ) -> System.out.println("Sum	:	"+( num1 + num2 ));
		math.sum(100, 20);
	}
	public static void main2(String[] args) {
		IMath math = ( int num1, int num2 ) -> System.out.println("Sum	:	"+( num1 + num2 ));
		math.sum(100, 20);
	}
	public static void main1(String[] args) {
		IMath math = ( int num3, int num4 ) -> System.out.println("Sum	:	"+( num3 + num4 ));
		math.sum(100, 20);
	}
}
