package org.sunbeam.dac.test;

import java.util.ArrayList;

public class Program {
	public static ArrayList< Integer > getIntegerList( ) {
		ArrayList<Integer> list = new ArrayList<>( );
		list.add( 10 );
		list.add( 20 );
		list.add( 30 );
		return list;
	}
	public static ArrayList< Double > getDoubleList( ) {
		ArrayList<Double> list = new ArrayList<>( );
		list.add( 10.1 );
		list.add( 20.2);
		list.add( 30.3 );
		return list;
	}
	public static ArrayList<String> getStringList( ) {
		ArrayList<String> list = new ArrayList<>( );
		list.add( "DAC" );
		list.add( "DMC");
		list.add( "KDAC" );
		return list;
	}
	private static void printIntegerList(ArrayList<Integer> list ) {
		for( Integer element : list )
			System.out.println(element);
	}
	private static void printDoubleList(ArrayList<Double> list) {
		for( Double element : list )
			System.out.println(element);
	}
	private static void printStringList(ArrayList<String> list) {
		for( String element : list )
			System.out.println(element);
	}
	public static void main(String[] args) {
		ArrayList<Integer> integerList = Program.getIntegerList();
		Program.printIntegerList( integerList );
		
		ArrayList<Double> doubleList = Program.getDoubleList();
		Program.printDoubleList( doubleList );
		
		ArrayList<String> stringList = Program.getStringList();
		Program.printStringList( stringList );
	}
}
