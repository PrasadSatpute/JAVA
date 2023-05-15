package org.sunbeam.function.test;

interface Printable{
	void print( );
}

class Test implements Printable{
	@Override
	public void print() {
		System.out.println("Test.print()");
	}
}
public class Program {
	public static void main(String[] args) {
		Printable p = new Test( ); //Upcasting
		p.print();
	}
}
