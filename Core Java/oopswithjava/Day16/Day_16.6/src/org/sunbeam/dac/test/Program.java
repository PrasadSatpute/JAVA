package org.sunbeam.dac.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();//OK : Upcasting
		c.add(10);
		c.add(20);
		c.add(30);
		
		List<Integer> list = new ArrayList<>(c);
		
		for( Integer element : list )
			System.out.println(element);
	}
	public static void main3(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>( 7 );	//OK
		
		List<Integer> list2 = new ArrayList<>( 7 );	//OK
		
		Collection<Integer> list3 = new ArrayList<>( 7 );	//OK
		
	}
	public static void main1(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>( );	//OK
		
		List<Integer> list2 = new ArrayList<>( );	//OK
		
		Collection<Integer> list3 = new ArrayList<>( );	//OK
		
	}
}
