package org.sunbeam.dac.test;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		for( int element : list )
			System.out.println(element);
	}
	public static void main1(String[] args) {
		int[] arr = new int[ 5 ];
		arr[ 0 ] = 10;
		arr[ 1 ] = 20;
		arr[ 2 ] = 30;
		arr[ 3 ] = 40;
		arr[ 4 ] = 50;
		
		for( int element : arr )
			System.out.println(element);
	}
}
