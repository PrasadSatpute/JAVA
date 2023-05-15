package org.sunbeam.function.test;

@FunctionalInterface
interface IMath {
	int add( int num1, int num2 );	
}
public class Program {
	public static void main(String[] args) {
		IMath math = Integer::sum;
		System.out.println("Result	:	"+math.add(100, 20));
	}
	public static void main1(String[] args) {
		IMath math = Integer::sum;
		int result = math.add(100, 20);
		System.out.println("Result	:	"+result);
	}
}
