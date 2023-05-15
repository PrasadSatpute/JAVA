package org.sunbeam.dac.test;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {	//args : Method Parameter
		//System.in : is standard stream object of Java associated with keyboard
		Scanner sc = new Scanner( System.in );	//System.in : Argument
		
		System.out.print("Name	:	");
		String name = sc.nextLine();
		System.out.print("Empid	:	");
		int empid = sc.nextInt();
		System.out.print("Salary	:	");
		float salary = sc.nextFloat();
		
		System.out.println("Name	:	"+name);
		System.out.println("Empid	:	"+empid);
		System.out.println("Salary	:	"+salary);
		
		sc.close();
	}
	public static void main5(String[] args) {
		String nm1 = "Sandeep Kulange";
		int id1 = 33;
		float sal1 = 125400.50f;
		
		
		String nm2 = "Amil Pol";
		int id2 = 3022;
		float sal2 = 85600.50f;
		
		//System.out.println(nm1+" "+id1+" "+sal1);
		//System.out.println(nm2+" "+id2+" "+sal2);
		
		//System.out.printf("%s%d%f\n",nm1, id1, sal1);
		//System.out.printf("%s%d%f\n",nm2, id2, sal2);
		
		//System.out.printf("%20s%5d%10.2f\n",nm1, id1, sal1);
		//System.out.printf("%20s%5d%10.2f\n",nm2, id2, sal2);
		
		System.out.printf("%-20s%-5d%-10.2f\n",nm1, id1, sal1);
		System.out.printf("%-20s%-5d%-10.2f\n",nm2, id2, sal2);
	}
	public static void main4(String[] args) {
		System.out.print("SunBeam");
		System.out.print("Infotech");
		System.out.print("Pune");
	}
	public static void main3(String[] args) {
		System.out.println("SunBeam");
		System.out.println("Infotech");
		System.out.println("Pune");
	}
	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);	//OK
	}
	public static void main1(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);	//OK
	}
}


