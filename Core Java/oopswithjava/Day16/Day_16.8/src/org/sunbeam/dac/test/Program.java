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
		
		Program.printList( list );
		
		//Collections.sort( list );
		list.sort(null);
		
		Program.printList( list );
	}
}
