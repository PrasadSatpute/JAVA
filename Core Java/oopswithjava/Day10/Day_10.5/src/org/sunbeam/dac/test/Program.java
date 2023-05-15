package org.sunbeam.dac.test;

class A{
	private int num1;
	public A( ) {
		this.num1 = 10;
	}
	public A(int num1) {
		this.num1 = num1;
	}
	
}
class B extends A{
	private int num2;
	public B( ) {
		this.num2 = 20;
	}
	public B( int num1, int num2) {
		super( num1 );
		this.num2 = num2;
	}
}
public class Program {
	public static void main1(String[] args) {
		B b = new B( 50, 60 );
	}
}
