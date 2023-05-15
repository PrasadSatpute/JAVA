package org.sunbeam.dac;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.add(45);
		set.add(103);
		set.add(7);
		set.add(99);
		set.add(18);
		set.add(null);
		
		set.add(45);
		set.add(103);
		set.add(7);
		set.add(99);
		set.add(18);
		set.add(null);
		
		for( Integer element : set )
			System.out.println(element);
		
	}		
	public static void main1(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(45);
		set.add(103);
		set.add(7);
		set.add(99);
		set.add(18);
		set.add(null);
		
		set.add(45);
		set.add(103);
		set.add(7);
		set.add(99);
		set.add(18);
		set.add(null);
		
		for( Integer element : set )
			System.out.println(element);
	}		
}
