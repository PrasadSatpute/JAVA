package org.sunbeam.dac.test;

class A{
	private int num1;
	public static int num2;
	
	public A( int num1 ) {
		this.num1 = num1;
	}
	public void print( ) {
		System.out.println("Num1	:	"+this.num1);
		System.out.println("Num2	:	"+A.num2);
		System.out.println("***********************");
	}
}
class B{
	private int num1;
	public static int num2;
	
	public B( int num1 ) {
		this.num1 = num1;
	}
	public void print( ) {
		System.out.println("Num1	:	"+this.num1);
		System.out.println("Num2	:	"+B.num2);
		System.out.println("***********************");
	}
}
public class Program {
	public static void main(String[] args) {
		A.num2 = 500;
		B.num2 = 600;
		
		A a1 = new A( 10 );
		A a2 = new A( 20 );
		A a3 = new A( 30 );
		
		a1.print();
		a2.print();
		a3.print();
		
		System.out.println("---------------------");
		
		B b1 = new B( 50 );
		B b2 = new B( 60 );
		B b3 = new B( 70 );
		
		b1.print();
		b2.print();
		b3.print();
	}
}
