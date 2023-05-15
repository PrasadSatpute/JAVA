package add_sub_mult_div;

import java.util.Scanner;

public class TwoNumbers {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter Two numbers for Addition:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println("Enter Two numbers for Subtraction:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println("Enter Two numbers for Multiplication:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println("Enter Two numbers for Addition:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a+" / "+b+" = "+(a/b));

	}

}
