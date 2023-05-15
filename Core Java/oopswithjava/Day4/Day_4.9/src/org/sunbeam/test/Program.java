package org.sunbeam.test;
class A{
	public void sum( int num1, int num2 ) {
		//System.out.println("A.Sum	:	"+num1 + num2);	//Sum	:	1020
		System.out.println("A.Sum	:	"+(num1 + num2));	//Sum	:	30
	}
}
class B extends A{
	public void sum( int num1, int num2 ) {
		System.out.println("B.Sum	:	"+(num1 + num2));	//Sum	:	30
	}
	public void sum( int num1, int num2, int num3 ) {
		System.out.println("B.Sum	:	"+(num1 + num2 + num3));	//Sum	:	30
	}
}
public class Program {
	public static void main3(String[] args) {
		String[] arr1 = new String[ ] { "ABC", "PQR", "XYZ"};
		String str = "ABC";
	}
	public static void main(String[] args) {
		B b = new B();
		b.sum(50, 60);	
		b.sum(10, 20, 30);
	}
	public static void main1(String[] args) {	
		A a = new A( );
		a.sum(10, 20);
	}
}
