package org.sunbeam.dac.test;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		int[] arr1 = new int[ 3 ];
		System.out.println( Arrays.toString(arr1));//[0, 0, 0]
		
		boolean[] arr2 = new boolean[ 3 ];
		System.out.println( Arrays.toString(arr2));//[false, false, false]
		
		double[] arr3 = new double[ 3 ];
		System.out.println( Arrays.toString(arr3));//[0.0, 0.0, 0.0]
		
	}
}
