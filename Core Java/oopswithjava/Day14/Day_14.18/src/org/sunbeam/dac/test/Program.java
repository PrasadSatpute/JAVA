package org.sunbeam.dac.test;
class Outer{
	private int num1 = 10;
	private static int num2 = 20;
	
	//Nested class
	public class Inner{
		private int num3 = 30;
		private static final int num4 = 40;
	}
	
	public void print( ) {	//Method of top level class
		System.out.println("Num1	:	"+this.num1);
		System.out.println("Num2	:	"+Outer.num2);
		
		Inner in = new Inner();
		
		System.out.println("Num3	:	"+in.num3);
		System.out.println("Num4	:	"+Inner.num4);	//OK
		//System.out.println("Num4	:	"+in.num4);	//OK
	}
}
public class Program {
	public static void main(String[] args) {
		Outer out = new Outer( );
		out.print();
	}
}
