package org.sunbeam.test;
class Complex{
	private int real;	//0
	private int imag;	//0
	
	public void printRecord( /*Complex this = c1*/) {
		System.out.println("Real Number	:	"+this.real);
		System.out.println("Imag Number	:	"+this.imag);
	}
}
public class Program {
	public static void main(String[] args) {
		Complex c1 = new Complex( );	//Here on instance compiler generated zero argument ctor will call.
		c1.printRecord();
		
		//Complex c2 = new Complex( 100, 300 );	//Not OK
		//c2.printRecord();
	}
}
