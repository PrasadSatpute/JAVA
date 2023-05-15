package org.sunbeam.dac.test;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int[] arr = new int[ ] { 10, 20, 30, 40, 50 };
		
		//foreach element in arr
		for( int element : arr ) {	//Read only and forward only loop
			System.out.println(element);
		}
	}
	public static void main1(String[] args) {
		int[] arr = new int[ ] { 50, 10, 20, 40, 30 };
		
		System.out.println(Arrays.toString(arr));	//[50, 10, 20, 40, 30]
		
		Arrays.sort(arr);	//DualPivotQuicksort
		
		System.out.println(Arrays.toString(arr));	//[10, 20, 30, 40, 50]

	}
}
