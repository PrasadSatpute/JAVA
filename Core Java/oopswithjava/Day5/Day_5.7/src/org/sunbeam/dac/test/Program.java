package org.sunbeam.dac.test;

class A{
	public static void f1() {
		System.out.println("A.f1");
	}
}
class B{
	public static void f2( ) {
		System.out.println("B.f2");
	}
	public static void f3( ) {
		//f1( );	//NOT OK
		A.f1( );	//OK
		
		f2( );		//OK
		B.f2( );	//OK
	}
}
public class Program {
	public static void main(String[] args) {
		B.f3( );	//OK
		//f3( );	//Not OK
	}
}
