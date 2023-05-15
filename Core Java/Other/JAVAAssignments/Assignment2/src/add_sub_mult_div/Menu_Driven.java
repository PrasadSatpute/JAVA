package add_sub_mult_div;

import java.util.Scanner;

public class Menu_Driven {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
			sc = new Scanner(System.in);
			
			int a,b;
			
			System.out.println("Choose Any one:");
			System.out.println("1 -> +");
			System.out.println("2 -> -");
			System.out.println("3 -> *");
			System.out.println("4 -> /");
			
			int choose = sc.nextInt();
			
			switch (choose) {
			case 1:
				System.out.println("Enter Two numbers for Addition:");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a+" + "+b+" = "+(a+b));
				break;
			case 2:
				System.out.println("Enter Two numbers for Subtraction:");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a+" - "+b+" = "+(a-b));			
				break;
			case 3:
				System.out.println("Enter Two numbers for Multiplication:");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a+" * "+b+" = "+(a*b));
				break;
			case 4:
				System.out.println("Enter Two numbers for Addition:");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a+" / "+b+" = "+(a/b));
				break;

			default:
				System.out.println("Please Enter Valide Option");
				break;
			}
			
			
			
			
			

		
	}

}
