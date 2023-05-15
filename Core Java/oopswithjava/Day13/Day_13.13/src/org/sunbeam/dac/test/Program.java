package org.sunbeam.dac.test;
public class Program {
	public static void main(String[] args) {
		int number = 10;
		Object obj = number;	//Auto-Boxing-Upcasting
		/*Integer integer = Integer.valueOf(number);	//Boxing
		 Object object = integer;	//Upcasting */
		
		System.out.println(obj.getClass().getName()); //java.lang.Integer
	}
	public static void main1(String[] args) {
		int number = 10;
		Integer integer = Integer.valueOf(number);	//Boxing
		Object object = integer;	//Upcasting
	}	
}
