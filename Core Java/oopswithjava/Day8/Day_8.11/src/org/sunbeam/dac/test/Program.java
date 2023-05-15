package org.sunbeam.dac.test;
public class Program {
	//int num2 = num1;
	private static void printRecord(int num2) {
		System.out.println("Num2	:	"+num2);
	}
	public static void main(String[] args) {
		int num1 = 10;
		Program.printRecord( num1 );
	}
}
