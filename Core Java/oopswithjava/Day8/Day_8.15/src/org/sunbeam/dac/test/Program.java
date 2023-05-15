package org.sunbeam.dac.test;

import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(int[] number) {
		System.out.print("Number	:	");
		number[ 0 ] = sc.nextInt();
	}

	private static void printRecord(int[] number) {
		System.out.println("Number	:	"+number[ 0 ]);
	}
	public static void main(String[] args) {
		int[] number = new int[ 1 ]; 
		
		Program.acceptRecord( number  );
		
		Program.printRecord( number  );
	}	
}
