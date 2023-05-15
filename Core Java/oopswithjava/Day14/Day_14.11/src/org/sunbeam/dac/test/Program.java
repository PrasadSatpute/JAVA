package org.sunbeam.dac.test;

import java.util.Date;

public class Program {
	public static void print( Object obj ) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		Program.print(true);
		Program.print('A');
		Program.print(123);
		Program.print(3.142);
		Program.print("Hello");
		Program.print(new Date());
	}
}
