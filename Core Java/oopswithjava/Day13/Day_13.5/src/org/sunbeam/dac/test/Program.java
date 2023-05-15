package org.sunbeam.dac.test;
class A extends Exception{ }
class B extends Exception{ }
class C extends Exception{ }
public class Program {
	public static void showRecord( int number ) throws A, B, C {
		if( number % 2 == 0 )
			throw new A( );
		if( ( number / 10 ) >= 1 )
			throw new B( );
		if ( number > 5 )
			throw new C( );
		System.out.println("Number	:	"+number);
	}
	public static void displayRecord( int number ) throws Exception{
		if( number % 2 == 0 )
			throw new A( );
		if( ( number / 10 ) >= 1 )
			throw new B( );
		if ( number > 5 )
			throw new C( );
		System.out.println("Number	:	"+number);
	}
	public static void main(String[] args) {
		try {
			Program.displayRecord(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main1(String[] args){
		try {
			Program.showRecord(5);
		} catch (A | B | C e) {
			e.printStackTrace();
		}
	}
}
