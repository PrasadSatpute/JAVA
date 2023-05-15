package org.sunbeam.dac.test;
import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static ArithmeticOperation menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Sum");
		System.out.println("2.Sub");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.print("Enter choice	:	");
		return ArithmeticOperation.values()[ sc.nextInt() ];
		
		/* int choice = sc.nextInt();
		return ArithmeticOperation.values()[ choice ]; */
		
		/* int choice = sc.nextInt();
		ArithmeticOperation[] arr = ArithmeticOperation.values(); //[EXIT, SUM, SUB, MULTIPLICATION, DIVISION]
		return arr[ choice ]; */
	}
	public static void main(String[] args) {
		ArithmeticOperation choice;
		while( ( choice = Program.menuList( ) ) != ArithmeticOperation.EXIT ) {
			int result = 0;
			switch( choice ) {
			case SUM:
				result = Calculator.sum(100, 20);
				break;
			case SUB:
				result = Calculator.sub(100, 20);
				break;
			case MULTIPLICATION:
				result = Calculator.multiplication(100, 20);
				break;
			case DIVISION:
				result = Calculator.division(100, 20);
				break;
			}
			System.out.println("Result	:	"+result);
		}
	}	
}
