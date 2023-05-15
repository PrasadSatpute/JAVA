package org.sunbeam.dac.test;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(int[][] arr) {
		for( int row = 0; row < arr.length; ++ row ) {
			for( int col = 0; col < arr[ row ].length; ++ col ) {
				System.out.print("Enter element	:	");
				arr[ row ][ col ] = sc.nextInt();
			}
		}
	}
	private static void printRecord(int[][] arr) {
		for( int row = 0; row < arr.length; ++ row ) {
			for( int col = 0; col < arr[ row ].length; ++ col ) {
				System.out.print(arr[ row ][ col ]+"	");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] arr = { { 1,2,3},{4,5},{6,7,8,9},{10,11,12}};
		
		Program.printRecord(arr);
	}
	public static void main3(String[] args) {
		int[][] arr = new int[4][]; //Array of references
		arr[ 0 ] = new int[ 3 ];
		arr[ 1 ] = new int[ 2 ];
		arr[ 2 ] = new int[ 4 ];
		arr[ 3 ] = new int[ 3 ];
		
		Program.acceptRecord(arr);
		
		Program.printRecord(arr);
	}
	public static void main2(String[] args) {
		int[][] arr = new int[4][]; //Array of references
		arr[ 0 ] = new int[ 3 ];
		arr[ 1 ] = new int[ 2 ];
		arr[ 2 ] = new int[ 4 ];
		arr[ 3 ] = new int[ 3 ];
		System.out.println(Arrays.deepToString(arr));	
	}
	public static void main1(String[] args) {
		int[][] arr = new int[4][]; //Array of references
		System.out.println(Arrays.deepToString(arr));	//[null, null, null, null]
	} 
}
