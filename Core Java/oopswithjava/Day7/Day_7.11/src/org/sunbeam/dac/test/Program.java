package org.sunbeam.dac.test;

import java.util.Objects;
import java.util.Scanner;

public class Program {
	private static void printRecord(int[] arr) {
		arr = Objects.requireNonNull(arr, "arr must not be null");
		for( int index = 0; index < arr.length; ++ index )
			System.out.print(arr[ index ]+"	");
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr1 = new int[ 3 ];
		Program.printRecord(arr1);
		
		int[] arr2 = new int[ 5 ];
		Program.printRecord(arr2);
		
		int[] arr3 = new int[ 7 ];
		Program.printRecord(arr3);
	}
}
