package org.sunbeam.dac.test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		System.out.println("Resource open()");
		
		Scanner sc = null;
		sc = new Scanner(System.in);
		
		System.out.print("Num1	:	");
		int num1 = sc.nextInt();
		System.out.print("Num2	:	");
		int num2 = sc.nextInt();
		
		int result = num1 / num2;
		System.out.println("Result	:	"+result);
		
		System.out.println("Resource closed()");
	}
}
