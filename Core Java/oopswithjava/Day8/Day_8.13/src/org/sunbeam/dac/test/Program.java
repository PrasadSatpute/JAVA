package org.sunbeam.dac.test;

public class Program {
	public static void swap( int num1, int num2 ) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		Program.swap(num1, num2);
		
		System.out.println("Num1	:	"+num1);
		System.out.println("Num2	:	"+num2);
	}
}
