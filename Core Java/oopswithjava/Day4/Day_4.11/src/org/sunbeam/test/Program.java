package org.sunbeam.test;
public class Program {
	public static void print( Integer obj ) {
		System.out.println("Integer "+obj);
	}
	public static void print( String obj ) {
		System.out.println("String "+obj);
	}
	public static void main(String[] args) {	
		Program.print(null);	//Ambiguty
	}
}
