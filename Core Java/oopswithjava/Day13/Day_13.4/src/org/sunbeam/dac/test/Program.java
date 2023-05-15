package org.sunbeam.dac.test;

import java.util.Scanner;

import org.sunbeam.dac.collection.Stack;
import org.sunbeam.dac.exceptions.StackOverflowException;
import org.sunbeam.dac.exceptions.StackUnderflowException;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(int[] element) {
		System.out.print("Enter element	:	");
		element[ 0 ] = sc.nextInt();
	}
	private static void printRecord(int[] element) {
		System.out.println("Popped element is : "+element[ 0 ]);
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args){
		int choice;
		int[] element = new int[ 1 ];
		Stack stk = new Stack( 5 );
		while( ( choice = Program.menuList( ) ) != 0 ) {
			try {
				switch( choice ) {
				case 1:
					Program.acceptRecord(element);
					stk.push( element[ 0 ] );
					break;
				case 2:
					element[ 0 ] = stk.peek( );
					Program.printRecord(element);
					stk.pop();
					break;
				}
			} catch (StackOverflowException | StackUnderflowException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}
