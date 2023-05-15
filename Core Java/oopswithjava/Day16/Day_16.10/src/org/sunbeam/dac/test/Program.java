package org.sunbeam.dac.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Program {
	private static void printList(List<Integer> list) {
		for( Integer element : list )
			System.out.print(element+"	");
		System.out.println();
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>( );
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		List<Integer> newList = new ArrayList<Integer>();
		newList.add(60);
		newList.add(70);
		newList.add(80);
		
		list.addAll(newList);
		
		Program.printList(list);
	}
}
