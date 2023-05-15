package org.sunbeam.dac.test;
class A{
	int num1 = 10;
}
class B extends  A{
	int num1 = 20;
	public void print( ) {
		System.out.println("Num1	:	"+num1);	//20 : Shadowing
		System.out.println("Num1	:	"+super.num1);	//10
		System.out.println("Num1	:	"+this.num1);	//20
	}
}
public class Program {
	public static void main(String[] args) {
		A a = new A( );
		
	}
	public static void main1(String[] args) {
		B b = new B( );
		b.print();
	}
}
