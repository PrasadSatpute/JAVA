package org.sunbeam.dac.test;

import java.util.Scanner;

//Encapsulation
class Complex{
	//Fields : data
	private int real;
	private int imag;
	public Complex() {
		this.real = 10;
		this.imag = 20;
	}
	//Methods : code
	public void acceptRecord( ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter real number	:	");
		this.real = sc.nextInt();
		System.out.print("Enter imag number	:	");
		this.imag = sc.nextInt();
	}
	public void printRecord( ) {
		System.out.println("Real Number	:	"+this.real);
		System.out.println("Imag Number	:	"+this.imag);
	}
}
public class Program {

	public static void main(String[] args) {
		//Abstraction
		Complex c1 = new Complex( );
		c1.acceptRecord( );
		c1.printRecord( );
	}

}
