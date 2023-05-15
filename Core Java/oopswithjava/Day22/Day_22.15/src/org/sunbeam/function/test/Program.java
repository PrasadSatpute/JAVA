package org.sunbeam.function.test;

@FunctionalInterface
interface IMath {
	int sum( int num1, int num2 );	//Functional Method	
}

public class Program {
	public static void main(String[] args) {
		IMath math = ( num1, num2 )-> num1 + num2;
		int result = math.sum(100, 20);
		System.out.println("Result	:	"+result);	//120
	}
	public static void main2(String[] args) {
		IMath math = ( num1, num2 )->{
			return num1 + num2;
		};
		
		int result = math.sum(100, 20);
		System.out.println("Result	:	"+result);	//120
	}
	public static void main1(String[] args) {
		IMath math = ( num1, num2 )->{
			int result = num1 + num2;
			return result;
		};
		
		int result = math.sum(100, 20);
		System.out.println("Result	:	"+result);	//120
	}
}
