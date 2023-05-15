package org.sunbeam.dac.test;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		int[] arr1 = new int[ ] { 1,2,3,4,5,6,7,8,9,10};
		int[] arr2 =  Arrays.copyOfRange(arr1, 3, 8);
		System.out.println(Arrays.toString(arr2));
	}
}
