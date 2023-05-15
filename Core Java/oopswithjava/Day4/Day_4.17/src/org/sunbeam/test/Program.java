package org.sunbeam.test;
import java.util.Scanner;
class Complex{
	private int real;	//0
	private int imag;	//0
	public Complex( int real, int imag) {	//Parameterized Constructor
		System.out.println("public Complex( int real, int imag)");
		this.real = real;
		this.imag = imag;
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
}
public class Program {
	public static void main(String[] args) {
		Complex c1 = new Complex( 10, 20 );
	}
}
