package org.sunbeam.test;

import java.util.Scanner;

class Complex{
	private int real;	//0
	private int imag;	//0
	private Complex() {	//Constructor
		System.out.println("public Complex()");
		this.real = 10;
		this.imag = 20;
	}
	public void acceptRecord( /*Complex this = c1*/) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Real Number	:	");
		this.real = sc.nextInt();
		System.out.print("Imag Number	:	");
		this.imag = sc.nextInt();
	}
	public void printRecord( /*Complex this = c1*/) {
		System.out.println("Real Number	:	"+this.real);
		System.out.println("Imag Number	:	"+this.imag);
	}
	public static void testConstructor( ) {
		System.out.println("Inside testConstructor method");
		Complex c1 = new Complex();	//OK : public Complex()
	}
}
public class Program {
	
	public static void main(String[] args) {
		Complex.testConstructor();
		
		//Complex c1 = new Complex( );	//The constructor Complex() is not visible
	}
}
