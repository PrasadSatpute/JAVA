package org.sunbeam.dac.test;
public class Program {
	public static void main(String[] args) {
		Integer integer = new Integer(123);	//Instance of a class
		int number = integer;	//Auto-UnBoxing
		//int number = integer.intValue();	//UnBoxing
		System.out.println(number);
	}
	public static void main3(String[] args) {
		String str = "123";
		int number = Integer.parseInt(str);	//UnBoxing
		System.out.println(number);
	}
	public static void main2(String[] args) {
		Integer integer = new Integer(123);	//Instance of a class
		int number = integer.intValue();	//UnBoxing
		System.out.println(number);
	}	
	public static void main1(String[] args) {
		Integer integer = null;	//Reference
		integer = new Integer("123");	//Instance of a class
		int number = integer.intValue();	//UnBoxing
		System.out.println(number);
	}	
}
