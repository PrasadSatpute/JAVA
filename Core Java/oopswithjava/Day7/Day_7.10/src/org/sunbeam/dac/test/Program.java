package org.sunbeam.dac.test;

import java.util.Objects;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(int[] arr) {
		arr = Objects.requireNonNull(arr, "arr must not be null");
		for( int index = 0; index < 3; ++ index ) {
			System.out.print("Enter element	:	");
			arr[ index ] = sc.nextInt();
		}
	}
	private static void printRecord(int[] arr) {
		arr = Objects.requireNonNull(arr, "arr must not be null");
		for( int index = 0; index < 3; ++ index )
			System.out.println(arr[ index ]);	
	}
//	private static void acceptRecord(int[] arr) {
//		if( arr != null ) {
//			for( int index = 0; index < 3; ++ index ) {
//				System.out.print("Enter element	:	");
//				arr[ index ] = sc.nextInt();
//			}
//		}
//	}
//	private static void printRecord(int[] arr) {
//		if( arr != null ) {
//			for( int index = 0; index < 3; ++ index )
//				System.out.println(arr[ index ]);
//		}
//	}
	public static void main(String[] args) {
		int[] arr = null;
		
		Program.acceptRecord( arr );
		
		Program.printRecord( arr );
	}
	public static void main6(String[] args) {
		int[] arr = new int[ 3 ];
		
		Program.acceptRecord( arr );
		
		Program.printRecord( arr );
	}
	
	
	public static void main5(String[] args) {
		int[] arr = new int[ 3 ];
		for( int index = 0; index < 3; ++ index )
			System.out.println(arr[ index ]);
	}
	public static void main4(String[] args) {
		int[] arr = new int[ 3 ];
		System.out.println(arr[ 0 ]);
		System.out.println(arr[ 1 ]);
		System.out.println(arr[ 2 ]);
	}
	public static void main3(String[] args) {
		int[] arr = new int[ -3 ];	//NegativeArraySizeException
	}
	public static void main2(String[] args) {
		int arr1[ ] = new int[ 3 ];	//OK
		
		int[] arr2 = new int[ 3 ];	//OK
	}
	public static void main1(String[] args) {
		int arr1[ ] = null;	//OK
		//int [ arr2 ] = null;	//Not OK
		int[ ] arr3 = null;	//OK
	}
}
