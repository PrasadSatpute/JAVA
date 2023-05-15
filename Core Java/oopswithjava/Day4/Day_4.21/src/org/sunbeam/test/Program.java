package org.sunbeam.test;
public class Program {
	public static void main(String[] args) {
		//public Integer(String s)throws NumberFormatException
		
		Integer i1 = new Integer("125");	//OK
		System.out.println(i1);
		
		String value = "125";
		Integer i2 = new Integer( value );	//OK
		System.out.println(i2);
		
		Integer i3 = new Integer("1A2B5");	//NumberFormatException
		System.out.println(i3);
	}
	public static void main2(String[] args) {
		//Integer(int value)
		Integer i1 = new Integer(123);	//OK
		
		int value = 123;
		Integer i2 = new Integer( value );	//OK
	}
	public static void main1(String[] args) {
		//Integer i = new Integer( );	//The constructor Integer() is undefined
	}
}
