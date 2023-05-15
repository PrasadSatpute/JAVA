package org.sunbeam.dac.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
	public static String toString( Date date ) {
		return new SimpleDateFormat("dd MMMM,yyyy").format(date);
	}
	public static void main(String[] args) {
		System.out.println(Program.toString(new Date()));
	}
	public static void main5(String[] args) {
		System.out.println(new SimpleDateFormat("dd MMMM,yyyy").format(new Date( )));
	}
	public static void main4(String[] args) {
		String strDate =  new SimpleDateFormat("dd MMMM,yyyy").format(new Date( ));
		System.out.println(strDate);
	}
	public static void main3(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM,yyyy");
		String strDate =  sdf.format(new Date( ));
		System.out.println(strDate);
	}
	public static void main2(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM,yyyy");
		String strDate =  sdf.format(date);
		System.out.println(strDate);
	}
	public static void main1(String[] args) {
		Date date = new Date();
		//String pattern = "dd/MM/yyyy";
		//String pattern = "dd/MMM/yyyy";
		String pattern = "dd MMMM,yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String strDate =  sdf.format(date);
		System.out.println(strDate);
	}	
}
