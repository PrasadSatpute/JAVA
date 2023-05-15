package org.sunbeam.dac.test;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		boolean[] arr1 = new boolean[ 3 ];
		System.out.println(Arrays.toString(arr1));
		
		byte[] arr2 = new byte[ 3 ];
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = new int[ 3 ];
		System.out.println(Arrays.toString(arr3));
		
		float[] arr4 = new float[ 3 ];
		System.out.println(Arrays.toString(arr4));
		
		double[] arr5 = new double[ 3 ];
		System.out.println(Arrays.toString(arr5));
	}
	public static void main3(String[] args) {
		boolean[] arr1 = new boolean[ 3 ];
		System.out.println(arr1.toString());	//[Z@6d06d69c
		
		byte[] arr2 = new byte[ 3 ];
		System.out.println(arr2.toString());	//[B@7852e922
		
		int[] arr3 = new int[ 3 ];
		System.out.println(arr3.toString());	//[I@4e25154f
		
		float[] arr4 = new float[ 3 ];
		System.out.println(arr4.toString());	//[F@70dea4e
		
		double[] arr5 = new double[ 3 ];
		System.out.println(arr5.toString());	//[D@5c647e05
	}
	public static void main2(String[] args) {
		//int[] arr = new int[  ]{ 10, 20, 30 };	//OK
		
		int[] arr = { 10, 20, 30 };	//OK
	}
	public static void main1(String[] args) {
		//{ 10, 20, 30 };	=> 	Initializer
		
		//int[] arr = new int[ 3 ];	//OK
		
		//int[] arr = new int[  ]{ 10, 20, 30 };	//OK
		
		//int[] arr = new int[ 3 ]{ 10, 20, 30 };	//Not OK
	}
}
