package org.sunbeam.dac.test;
public class Program {
	public static void main(String[] args) {
		class Complex{	//Method Local Inner class
			private int real = 10;
			private int imag = 20;
			
			public void printRecord( ) {
				System.out.println("Real Number	:	"+this.real);
				System.out.println("Imag Number	:	"+this.imag);
			}
		}
		Complex c1 = new Complex( );
		c1.printRecord();
		
	}
}
