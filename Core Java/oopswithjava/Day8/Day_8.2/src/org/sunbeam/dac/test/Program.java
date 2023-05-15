package org.sunbeam.dac.test;

import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(int[] arr) {
		for( int index = 0; index < arr.length; ++ index ) {
			System.out.print("Enter element	:	");
			arr[ index ] = sc.nextInt(); 
		}
	}

	private static void printRecord(int[] arr) {
		for( int element : arr )
			System.out.print( element+"	");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = new int[ 5 ];
		Program.acceptRecord( arr );
		Program.printRecord( arr );
	}
}
