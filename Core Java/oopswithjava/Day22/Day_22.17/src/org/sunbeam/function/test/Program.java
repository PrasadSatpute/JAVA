package org.sunbeam.function.test;

@FunctionalInterface
interface Printable {
	void print( );	
}
public class Program {
	public void showRecord( ) {
		System.out.println("Inside showRecord");
	}
	public static void main(String[] args) {
		Printable p = new Program()::showRecord;	//Method reference to non static method
		p.print( );
	}
	public static void main2(String[] args) {
		Program program = new Program();
		Printable p = program::showRecord;	//Method reference to non static method
		p.print( );
	}
	public static void main1(String[] args) {
		Printable p = ( ) -> System.out.println("Inside print");
		p.print( );
	}
}
