package org.sunbeam.dac.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class Program {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>( );	//OK
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Integer element = null;
		//ListIterator<Integer> itr = list.listIterator();
		//ListIterator<Integer> itr = list.listIterator( 2 );
		ListIterator<Integer> itr = list.listIterator( list.size() );
		
		while( itr.hasNext()) {
			element = itr.next();
			System.out.print( element+"	");
		}
		System.out.println();
		while( itr.hasPrevious()) {
			element = itr.previous();
			System.out.print( element+"	");
		}
	}
	public static void main5( String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50 );
		list.forEach(System.out::println);
	}
	public static void main4(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50 );
		//System.out.println(list.getClass().getName()); //java.util.Arrays$ArrayList
		for( Integer element : list )
			System.out.println(element);
	}
	public static void main3(String[] args) {
		List<Integer> list = new ArrayList<>( );	//OK
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Integer element = list.get( list.size() );	//IndexOutOfBoundsException
		System.out.println(element);
	}
	public static void main2(String[] args) {
		List<Integer> list = new ArrayList<>( );	//OK
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Integer element = null;
		for( int index = 0; index < list.size(); ++ index ){
			element = list.get(index);
			System.out.println(element);
		}
	}
	public static void main1(String[] args) {
		List<Integer> list = new ArrayList<>( );	//OK
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("Count	:	"+list.size());
		System.out.println("First Element	:	"+list.get(0));
		System.out.println("Last Element	:	"+list.get(4));
	}
}
