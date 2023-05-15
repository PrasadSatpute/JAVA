package org.sunbeam.dac.test;

//Top Level class
class Outer{	
	//Non static nested class( also called as inner class )
	public class Inner{	
		void print( ) {
			System.out.println("Inner.print");
		}	
	}
	void print( ) {
		System.out.println("Outer.print");
	}
}
public class Program {
	public static void main(String[] args) {
		 new Outer( ).new Inner( ).print();
	}
	public static void main5(String[] args) {
		Outer.Inner in = new Outer( ).new Inner( );
		in.print();
	}
	public static void main4(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner( );
	}
	public static void main3(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = null;
		in = out.new Inner( );
	}
	public static void main2(String[] args) {
		new Outer( ).print();
	}
	public static void main1(String[] args) {
		Outer out = new Outer();
		out.print();
	}
}
