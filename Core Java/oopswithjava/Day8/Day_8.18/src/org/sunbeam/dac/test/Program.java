package org.sunbeam.dac.test;

public class Program {
	public static void main2(String[] args) {
		if( System.out.printf("Hello World") != null) {
		}
	}
	public static void main(String[] args) {
		//PrintStream printf(String format, Object ... args)
		
		String name = "ABC";
		int age = 23;
		
		System.out.printf( "%-10s%-5d\n", name, age );	//ABC       23  
		System.out.printf( "%-10s\n", name);	//ABC       
		System.out.printf("Hello World");
	}	
}
