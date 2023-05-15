package org.sunbeam.dac.test;

import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(50);
		set.add(10);
		set.add(40);
		set.add(20);
		set.add(30);
		
		set.add(50);
		set.add(10);
		set.add(40);
		set.add(20);
		set.add(30);
		
		set.add( null ); //NullPointerException
		for (Integer element : set) {
			System.out.println(element);
		}
	
	}
	public static void main1(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(50);
		set.add(10);
		set.add(40);
		set.add(20);
		set.add(30);
		
		set.add(50);
		set.add(10);
		set.add(40);
		set.add(20);
		set.add(30);
		
		set.add( null ); //NullPointerException
		for (Integer element : set) {
			System.out.println(element);
		}
	
	}
}
