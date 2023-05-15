package org.sunbeam.dac.test;
//java.lang.Exception
	//java.lang.RuntimeException
		//java.lang.IllegalArgumentException
			//java.lang.NumberFormatException

//public static int parseInt(String s)throws NumberFormatException
public class Program {
	public static void main(String[] args){
		String str = "123";
		int number = Integer.parseInt(str);
		System.out.println("Number	:	"+number);
	}
}
