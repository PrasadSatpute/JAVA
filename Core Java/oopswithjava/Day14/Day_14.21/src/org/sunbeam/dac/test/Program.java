package org.sunbeam.dac.test;
//static class Outer{	//Not OK

//Top Level class
class Outer{	//Outer.class
	//Static Nested class
	public static class Inner{	//Outer$Inner.class
		
	}
}
public class Program {
	public static void main(String[] args) {
		Outer.Inner in = new Outer.Inner( ); 
	}
	public static void main1(String[] args) {
		Outer out = new Outer( );
	}
}
