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
		list.add(50);
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(20);
		
		Integer key = new Integer(30);
		if( list.contains(key)) {
			int index = list.indexOf(key);
			 Integer value = list.get(index);
			 //list.remove(index);
			 System.out.println("Found : "+value);
		}else
			System.out.println(key+" not found");
	}
}
