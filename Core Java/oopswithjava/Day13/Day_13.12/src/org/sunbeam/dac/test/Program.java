package org.sunbeam.dac.test;
public class Program {
	//int   => Primitive type / Value type
	//class => Non primitive type / reference type
	//String is a final class declared in java.lang package.
	//Integer is a final class declared in java.lang package.
	public static void main(String[] args) {
		int number = 10;
		String str =  String.valueOf(number); //Boxing
	}
	public static void main3(String[] args) {
		int number = 10;
		String str =  Integer.toString(number); //Boxing
	}
	public static void main2(String[] args) {
		int number = 10;
		Integer i = new Integer(number); //Boxing
	}
	public static void main1(String[] args) {
		int number = 10;
		Integer i = Integer.valueOf(number); //Boxing
	}	
}
