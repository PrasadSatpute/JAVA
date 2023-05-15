package org.sunbeam.function.test;

interface Printable {
	void print();
}

public class Program {
	public static void test( Printable p ) {
		if( p != null ) {
			p.print();
		}
	}
	public static void main(String[] args) {
		//Behaviour Parameterization before Java 8
		Program.test(new Printable() {	
			@Override
			public void print() {
				System.out.println("Inside print");
			}
		});
	}
}
