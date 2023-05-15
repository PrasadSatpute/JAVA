package org.sunbeam.test;
class Complex{
	private int real;	//0
	private int imag;	//0
	public Complex() {	//parameterless constructor
		//Constructor call must be the first statement in a constructor
		this( 10, 20 );	//Constructor chaining	
	}
	public Complex(int real, int imag) {	//Parameterized constructor
		this.real = real;
		this.imag = imag;
	}
	public void printRecord( /*Complex this = c1*/) {
		System.out.println("Real Number	:	"+this.real);
		System.out.println("Imag Number	:	"+this.imag);
	}
}
public class Program {
	public static void main(String[] args) {
		Complex c1 = new Complex( );
		c1.printRecord();
	}
}
