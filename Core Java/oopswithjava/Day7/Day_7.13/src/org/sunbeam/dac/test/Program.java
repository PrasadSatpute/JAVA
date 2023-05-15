package org.sunbeam.dac.test;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int[] arr = new int[ ] { 10, 20, 30 };
		
		System.out.println(arr[ -1 ] );	//ArrayIndexOutOfBoundsException
		
		System.out.println(arr[ 0 ] );//10
		
		System.out.println(arr[ 1 ] );//20
		
		System.out.println(arr[ 2 ] );//30
		
		System.out.println(arr[ 3 ] ); 	//ArrayIndexOutOfBoundsException
		
	}
}
