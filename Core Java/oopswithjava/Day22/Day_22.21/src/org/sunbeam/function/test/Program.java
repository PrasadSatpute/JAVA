package org.sunbeam.function.test;

@FunctionalInterface
interface Supplier {
	String changeCase( String str );	//Functional Method
}
public class Program {
	public static void main(String[] args) {
		Supplier s = String::toUpperCase;
		String name =  s.changeCase("SunBeam");
		System.out.println("Name	:	"+name);
	}
	public static void main1(String[] args) {
		Supplier s = str -> str.toUpperCase();
		String name =  s.changeCase("SunBeam");
		System.out.println("Name	:	"+name);
	}
}
