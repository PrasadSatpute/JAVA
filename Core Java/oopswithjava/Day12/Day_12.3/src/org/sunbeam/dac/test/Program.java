package org.sunbeam.dac.test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		//public Throwable()
		Throwable th1 = new Throwable( );
		
		//public Throwable(String message)
		Throwable th2 = new Throwable( "custom message" );
		
		//public Throwable(Throwable cause)
		Throwable cause = new Throwable( "custom message" );
		Throwable th3 = new Throwable( cause );
		
		//public Throwable(String message, Throwable cause)
		String message = "custom message";
		Throwable cs = new Throwable( );
		Throwable th4 = new Throwable( message , cs );
	}
}
