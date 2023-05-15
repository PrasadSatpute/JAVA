package org.sunbeam.dac.test;

public class Program {
	public static void swap( int[] arr ) {
		int temp = arr[ 0 ];
		arr[ 0 ] = arr[ 1 ];
		arr[ 1 ] = temp;
	}
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int[] arr = new int[ ] { num1, num2 };
		Program.swap( arr );
		num1 = arr[ 0 ]; num2 = arr[ 1 ];
		
		System.out.println("Num1	:	"+num1);
		System.out.println("Num2	:	"+num2);
	}
}
