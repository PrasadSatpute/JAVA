package org.sunbeam.dac.test;
public class Program {
	public static void main(String[] args) {
		String str = "1a2B3c";
		int num1 = Integer.parseInt(str); //NumberFormatException
		System.out.println(num1);
	}
	public static void main3(String[] args) {
		String str = "3.142d";
		double num1 = Double.parseDouble(str);
		System.out.println(num1);
	}
	public static void main2(String[] args) {
		String str = "125.50f";
		float num1 = Float.parseFloat(str);
		System.out.println(num1);
	}
	public static void main1(String[] args) {
		String str = "125";
		int num1 = Integer.parseInt(str);
		System.out.println(num1);
	}
}
