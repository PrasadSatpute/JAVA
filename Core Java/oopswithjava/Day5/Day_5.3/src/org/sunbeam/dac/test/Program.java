package org.sunbeam.dac.test;
class Complex{
	private int real;
	private int imag;
	public Complex(int real, int imag) {
		this.real = real;
		this.imag = imag;
	}
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImag() {
		return imag;
	}
	public void setImag(int imag) {
		this.imag = imag;
	}
}
public class Program {
	public static void main(String[] args) {
		final Complex c1 = new Complex( 10, 20 );
		c1.setReal(11);
		c1.setImag(21);
		
		//c1 = new Complex( 50, 60 );	//Not OK
		
		System.out.println(c1.getReal()+"	"+c1.getImag());	//11	21
	}
	public static void main1(String[] args) {
		Complex c1 = null;	//Initialization
		
		c1 = new Complex( 10, 20 );	//Assignment
		
		c1 = new Complex( 50, 60 );	//Assignment
		
		System.out.println(c1.getReal()+"	"+c1.getImag());	//50	60
	}
}
