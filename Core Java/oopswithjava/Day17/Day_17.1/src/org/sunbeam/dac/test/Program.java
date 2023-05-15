package org.sunbeam.dac.test;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Program {

	private static Vector<Integer> getVector() {
		Vector<Integer> v = new Vector<>( );
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		return v;
	}
	public static void main(String[] args) {
		Vector<Integer> v = Program.getVector( );
		Integer element = null;
		ListIterator<Integer> itr = v.listIterator();
		while( itr.hasNext()) {
			element = itr.next();
			System.out.print(element+"	");
		}
		System.out.println();
		while( itr.hasPrevious()) {
			element = itr.previous();
			System.out.print(element+"	");
		}
	}
	public static void main2(String[] args) {
		Vector<Integer> v = Program.getVector( );
		Integer element = null;
		Iterator<Integer> itr = v.iterator();
		while( itr.hasNext()) {
			element = itr.next();
			System.out.println(element);
		}
 	}
	public static void main1(String[] args) {
		Vector<Integer> v = Program.getVector( );
		Integer element = null;
		Enumeration<Integer> e = v.elements();
		while( e.hasMoreElements()) {
			element = e.nextElement();
			System.out.println(element);
		}
 	}
}
