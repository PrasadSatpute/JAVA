package org.sunbeam.function.test;

interface Printable {
	void print();
}

public class Program {
	public static void main(String[] args) {

		class Test implements Printable {	//Method Local Inner class
			@Override
			public void print() {
				System.out.println("Test.print()");
			}
		}
		
		Printable p = new Test(); // Upcasting
		p.print();
	}
}
