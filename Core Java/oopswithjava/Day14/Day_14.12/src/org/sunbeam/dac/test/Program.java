package org.sunbeam.dac.test;

import java.util.Date;

public class Program {
	/* public static <T> void print( T obj ) {
		System.out.println(obj);
	}*/
	
	public static <T extends Number> void print( T obj ) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		Program.print(true);
		Program.print('A');
		Program.print(123);		//OK
		Program.print(3.142);	//OK
		Program.print("Hello");
		Program.print(new Date());
	}
}
