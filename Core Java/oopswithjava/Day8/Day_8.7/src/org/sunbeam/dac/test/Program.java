package org.sunbeam.dac.test;
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
		int[][] arr = new int[ 4 ][ 3 ];	
		
		Program.acceptRecord( arr );
		
		Program.printRecord( arr );
	}
	public static void main4(String[] args) {
		int[][] arr = new int[ 4 ][ 3 ];	
		for( int row = 0; row < arr.length; ++ row ) {
			for( int col = 0; col < arr[ row ].length; ++ col ) {
				System.out.print(arr[ row ][ col ]+"	");
			}
			System.out.println();
		}
	}
	public static void main3(String[] args) {
		int[][] arr = new int[ 4 ][ 3 ];	
		System.out.println(arr.length);
		System.out.println(arr[ 0 ].length);
		System.out.println(arr[ 1 ].length);
		System.out.println(arr[ 2 ].length);
		System.out.println(arr[ 3 ].length);
	}
	public static void main2(String[] args) {
		int[][] arr = new int[ 4 ][ 3 ];	//OK
	}
	public static void main1(String[] args) {
		int arr1[][] = null;
		
		int[] arr2[] = null;
		
		int[][] arr3 = null;
	}
}
