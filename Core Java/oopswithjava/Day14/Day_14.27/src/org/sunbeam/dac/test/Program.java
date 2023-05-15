package org.sunbeam.dac.test;

interface Printable{
	void print( );
}
public class Program {	
	public static void main(String[] args) {	
		Printable p = new Printable() {	
			@Override
			public void print() {
				System.out.println("Hello");
			}
		};
		p.print();
 	}
}
