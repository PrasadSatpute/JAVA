package org.sunbeam.test;

import java.lang.reflect.Field;

class Complex{
	private int real;	//0
	private int imag;	//0
	public Complex() {
	}
	public int getReal() {
		return real;
	}
	public int getImag() {
		return imag;
	}
}
public class Program {
	private static void printRecord(Complex complex) {
		System.out.println("Real Number	:	"+complex.getReal());
		System.out.println("Imag Number	:	"+complex.getImag());
	}
	public static void main(String[] args) {
		try {
			Complex complex = new Complex();
			Program.printRecord( complex );	//0, 0 
			
			Class<?> c = complex.getClass();
			Field field = null;
			
			field = c.getDeclaredField("real");
			field.setAccessible(true);
			field.setInt(complex, 50);
			
			field = c.getDeclaredField("imag");
			field.setAccessible(true);
			field.setInt(complex, 60);
			
			Program.printRecord( complex );	//50, 60 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
