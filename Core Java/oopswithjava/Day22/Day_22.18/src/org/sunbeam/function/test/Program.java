package org.sunbeam.function.test;

@FunctionalInterface
interface Printable {
	void print( );	
}
public class Program {
	public static void printRecord( ) {
		System.out.println("Inside printRecord");
	}
	public static void main(String[] args) {
		Printable p = Program::printRecord; //Method Reference using static method
		p.print();
	}
}
