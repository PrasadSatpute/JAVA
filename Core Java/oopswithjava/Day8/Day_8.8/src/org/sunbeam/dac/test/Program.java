package org.sunbeam.dac.test;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		for( int[] row : arr ) {
			for( int col : row ) {
				System.out.print(col +"	") ;
			}
			System.out.println();
		}
	}
	public static void main2(String[] args) {
		int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		
		//System.out.println(arr.toString());	//[[I@6d06d69c
		
		//System.out.println(Arrays.toString(arr));
		
		//for( int index = 0; index < arr.length; ++ index )
			//System.out.println(Arrays.toString(arr[ index ] ) );
		
		System.out.println(Arrays.deepToString(arr));
	}

	public static void main1(String[] args) {
		// int[][] arr = new int[ 4 ][ 3 ]; //OK

		// int[][] arr = new int[ ][ ] { {1,2,3},{4,5,6},{7,8,9},{10,11,12}}; //OK

		// int[][] arr = { {1,2,3},{4,5,6},{7,8,9},{10,11,12}}; //OK

		// int[][] arr = new int[ 4 ][ 3 ] { {1,2,3},{4,5,6},{7,8,9},{10,11,12}}; //NOT OK
		
	}
}
