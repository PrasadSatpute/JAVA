package org.sunbeam.test;

import java.io.Serializable;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("F.Q.Class Name	:	");
			String className = sc.nextLine();	//java.io.File -- class instance
			//Class<String> c1 = String.class;
			//Class<? extends String> c2 = className.getClass();
			Class<?> c = Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main2(String[] args) {
		Class<?> c1 = Serializable.class;
		Class<?> c2 = Number.class;
	}
	public static void main1(String[] args) {
		Integer number = new Integer(0);	//Concrete class
		
		Class<?> c = number.getClass();	//OK
			
		//Class<?> c = Integer.class;	//OK
	}
}
