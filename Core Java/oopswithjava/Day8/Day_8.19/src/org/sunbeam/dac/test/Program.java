package org.sunbeam.dac.test;

import java.util.Scanner;

enum Color{
	RED, GREEN, BLUE	//RED, GREEN, BLUE : name of enum constants
	//0, 1, 2 => Ordinal
}
/* 
	final class Color extends Enum<Color> {
	  public static final Color RED;
	
	  public static final Color GREEN;
	
	  public static final Color BLUE;
	
	  public static Color[] values();
	
	  public static Color valueOf(String name );
	   
	}
*/

public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Color name(RED/GREEN/BLUE)	:	");
		String colorName = sc.nextLine();
		Color color = Color.valueOf(colorName.toUpperCase());
		System.out.println(color.name()+"	"+color.ordinal());
	}
	public static void main4(String[] args) {
		Color[] colors = Color.values();
		for (Color color : colors)
			System.out.println(color.name()+"	"+color.ordinal());
	}
	public static void main3(String[] args) {
		Color color = Color.RED;
		System.out.println(color.name()+"	"+color.ordinal());
		
		color = Color.GREEN;
		System.out.println(color.name()+"	"+color.ordinal());
		
		color = Color.BLUE;
		System.out.println(color.name()+"	"+color.ordinal());
	}
	public static void main2(String[] args) {
		Color color = Color.RED;
		System.out.println(color.name()+"	"+color.ordinal());
	}
	public static void main1(String[] args) {
		System.out.println(Color.RED.toString());
		System.out.println(Color.GREEN.toString());
		System.out.println(Color.BLUE.toString());
	}	
}
