package org.sunbeam.dac.test;
public class Program {
	static int number = 0;
	private static void f3() {
		System.out.println("Inside f3 method");
		if( number == 0 )
			throw new RuntimeException( );
		System.out.println("f3's resource is closed");
		
	}
	private static void f2() {
		System.out.println("Inside f2 method");
		f3( );
		System.out.println("f2's resource is closed");
		
	}
	private static void f1() {
		System.out.println("Inside f1 method");
		f2( );
		System.out.println("f1's resource is closed");
	}
	public static void main(String[] args) {
		f1( );
	}
}
