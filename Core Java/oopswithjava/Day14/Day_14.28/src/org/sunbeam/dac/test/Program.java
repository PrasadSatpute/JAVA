package org.sunbeam.dac.test;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Number	:	");
		System.out.println(Integer.parseInt(new StringBuffer(String.valueOf( sc.nextInt())).reverse().toString()));
	}
	public static void main4(String[] args) {
		System.out.print("Number	:	");
		int number = sc.nextInt();
		String strNumber = String.valueOf(number);
		StringBuffer sb = new StringBuffer(strNumber);
		sb.reverse();
		strNumber = sb.toString();
		number = Integer.parseInt(strNumber);
		System.out.println("Number	:	"+number);
	}
	public static void main3(String[] args) {
		String str = "www.sunbeaminfo.com";
		String regex = "\\.";
		String[] words = str.split(regex);
		for( String word : words )
			System.out.println(word);
	}
	public static void main2(String[] args) {
		String str = "SunBeam Infotech Pune";
		String regex = " ";
		String[] words = str.split(regex);
		for( String word : words )
			System.out.println(word);
	}
	public static void main1(String[] args) {
		String str = "SunBeam Infotech Pune";
		//String subString =  str.substring(8);
		String subString =  str.substring(8, 16);
		System.out.println(subString);
	}
}
