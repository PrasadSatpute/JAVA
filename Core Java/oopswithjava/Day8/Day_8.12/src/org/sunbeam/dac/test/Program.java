package org.sunbeam.dac.test;
class Complex{
	private int real;
	private int imag;
	public Complex(int real, int imag) {
		this.real = real;
		this.imag = imag;
	}
}
public class Program {
	private static void printRecord(Complex c2) {
		//TODO
	}
	public static void main(String[] args) {
		Complex c1 = new Complex( 10, 20 );
		
		Program.printRecord( c1 );
	}

}
