package org.sunbeam.dac.test;

import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Sum");
		System.out.println("2.Sub");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.print("Enter choice	:	");
		int choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		int choice;
		while( ( choice = Program.menuList( ) ) != 0 ) {
			int result = 0;
			switch( choice ) {
			case 1:
				result = Calculator.sum(100, 20);
				break;
			case 2:
				result = Calculator.sub(100, 20);
				break;
			case 3:
				result = Calculator.multiplication(100, 20);
				break;
			case 4:
				result = Calculator.division(100, 20);
				break;
			}
			System.out.println("Result	:	"+result);
		}
	}	
}
