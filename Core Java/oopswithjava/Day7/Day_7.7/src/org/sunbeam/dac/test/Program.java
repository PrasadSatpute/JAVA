package org.sunbeam.dac.test;

import java.util.Scanner;

public class Program {
	public static int sum( int num1, int num2 ) {
		return num1 + num2;
	}
	public static int sub( int num1, int num2 ) {
		return num1 - num2;
	}
	public static int multiplication( int num1, int num2 ) {
		return num1 * num2;
	}
	public static int division( int num1, int num2 ) {
		return num1 / num2;
	}
	public static int menuList( ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0.Exit");
		System.out.println("1.Sum");
		System.out.println("2.Sub");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		while ( ( choice = Program.menuList( ) ) != 0 ) {
			int result = 0;
			switch( choice ) {
			case 1:
				result = Program.sum(100, 20);
				break;
			case 2:
				result = Program.sub(100, 20);
				break;
			case 3:
				result = Program.multiplication(100, 20);
				break;
			case 4:
				result = Program.division(100, 20);
				break;
			}
			System.out.println("Result	:	"+result);
		}
	}
}
