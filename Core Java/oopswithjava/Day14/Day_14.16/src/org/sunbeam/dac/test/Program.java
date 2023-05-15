package org.sunbeam.dac.test;

//private class Outer{	//Not OK
//protetced class Outer{	//Not OK
//static class Outer{	//Not OK

//Top Level class
class Outer{	//Outer.class
	//Nested class
	//private class Inner{	//Outer$Inner.class	//OK
	//class Inner{	//Outer$Inner.class	//OK
	//protected class Inner{	//Outer$Inner.class	//OK
	public class Inner{	//Outer$Inner.class	//OK
		
	}
}
public class Program {
	public static void main(String[] args) {
		
	}
}
