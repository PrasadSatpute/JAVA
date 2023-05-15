package org.sunbeam.dac.test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
	public static String toString( Date date ) {
		return new SimpleDateFormat("dd MMMM,yyyy").format(date);
	}
	
	public static void main(String[] args) throws Exception {
		Object obj = new Date( );

		Date date = (Date) obj;	//Downcasting
		System.out.println(toString(date)); //null
		
		System.out.println("Press any key to continue...");
		System.in.read();
		
		String str = (String) obj; //Downcasting : ClassCastException
		System.out.println(str); //null		
	}
	public static void main3(String[] args) {
		Object obj = null;

		Date date = (Date) obj;	//Downcasting
		System.out.println(date); //null
		
		String str = (String) obj; //Downcasting
		System.out.println(str); //null		
	}
	public static void main2(String[] args) {
		//String str = new String("SunBeam-DAC");	//OK
		
		Object obj = new String("SunBeam-DAC");	//Ok : Upcasting
		String str = (String) obj;	//OK : Downcasting
		System.out.println(str);
	}
	public static void main1(String[] args) {
		//Date date = new Date();	//OK
		
		Object obj = new Date( );	//OK : Upcasting
		Date date = (Date) obj;	//OK : DownCasting
		System.out.println(Program.toString(date));
	}	
}
