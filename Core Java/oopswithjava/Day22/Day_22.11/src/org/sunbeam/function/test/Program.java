package org.sunbeam.function.test;

interface Printable {
	void print();
}

public class Program {
	public static void main(String[] args) {
		Printable p = new Printable() {		//Anonymoys inner class
			@Override
			public void print() {
				System.out.println("Inside print");
			}
		};
		p.print();
	}
}
