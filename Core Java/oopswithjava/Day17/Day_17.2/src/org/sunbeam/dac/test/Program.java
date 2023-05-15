package org.sunbeam.dac.test;

import java.util.ConcurrentModificationException;
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
	public static void main1(String[] args) {
		Vector<Integer> v = Program.getVector( );
		Integer element = null;
		Iterator<Integer> itr = v.iterator();
		while( itr.hasNext()) {
			element = itr.next();
			System.out.println(element);
			if( element == 50 )
				v.add(50); //ConcurrentModificationException
		}
 	}
	public static void main(String[] args) {
		Vector<Integer> v = Program.getVector( );
		Integer element = null;
		Enumeration<Integer> e = v.elements();
		while( e.hasMoreElements()) {
			element = e.nextElement();
			System.out.println(element);
			if( element == 50 )
				v.add(60);	//Ok
		}
 	}
}
