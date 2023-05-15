package org.sunbeam.dac.test;

import java.util.Iterator;
import java.util.LinkedList;

public class Program {
	public static void main3(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		Integer element = null;
		Iterator<Integer> itr = list.iterator();
		while( itr.hasNext()) {
			element = itr.next();
			System.out.println(element);
		}
	}
	public static void main2(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		for( Integer element : list )
			System.out.println(element);
	}
	public static void main1(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		list.forEach(System.out::println);	//Method Reference
	}
}
