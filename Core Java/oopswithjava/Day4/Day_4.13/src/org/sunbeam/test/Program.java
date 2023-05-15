package org.sunbeam.test;

import java.util.Scanner;

class Complex{
	private int real;	//0
	private int imag;	//0
	public Complex() {	//Constructor
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
		Complex c1 = new Complex();
	}
}
public class Program {
	public static void main(String[] args) {
		Complex c1 = new Complex();	//OK : public Complex()
		
		Complex.testConstructor();
	}
	public static void main1(String[] args) {	
		//Instantiation : ClassName identifier = new ClassName( );
		Complex c1 = new Complex( ); //Here, Instance is created W/O passing args
		//c1.Complex( );	//Explict call to the constructor : Not OK
	}
}
