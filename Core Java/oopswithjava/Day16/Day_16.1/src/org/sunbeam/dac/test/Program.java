package org.sunbeam.dac.test;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		ArrayList<Integer> list2 = (ArrayList<Integer>) list1.clone();
		
		list1.clear();
		
		for( Integer element : list1 )
			System.out.println(element);
		
		System.out.println("----------");
		for( Integer element : list2 )
			System.out.println(element);
	}
	public static void main1(String[] args) {
		int[] arr1 = new int[ ] { 10, 20, 30 };
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
	}
}
