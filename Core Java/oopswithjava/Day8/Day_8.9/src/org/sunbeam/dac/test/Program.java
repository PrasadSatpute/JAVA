package org.sunbeam.dac.test;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int[][][] arr = new int[2][2][3];
		for( int i = 0; i < 2; ++ i ) {
			for( int j = 0; j < 2; ++ j ) {
				for( int k = 0; k < 3; ++ k ) {
					System.out.print(arr[ i ][ j ][k ]+"	");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
