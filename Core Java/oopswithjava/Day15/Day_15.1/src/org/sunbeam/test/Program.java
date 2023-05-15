package org.sunbeam.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Validator{
	public static final String NAME_PATTREN = "TODO";
	public static final String EMAIL_PATREN = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	public static final String PHONE_PATREN = "TODO";
	public static boolean validateName( String name ) {
		return name.matches(NAME_PATTREN);
	}
	public static boolean validateEmail( String email ) {
		return email.matches(EMAIL_PATREN);
	}
	public static boolean validatePhone( String phone ) {
		return phone.matches(PHONE_PATREN);
	}
}
public class Program {
	public static void main(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("Enter email	:	");
			String email = sc.nextLine();
			if( Validator.validateEmail(email) )
				System.out.println("Email	:	"+email);
			else
				System.out.println("Invalid email");
		}
	}
	public static void main3(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("Enter email	:	");
			String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			String email = sc.nextLine();
			if( email.matches(regex))
				System.out.println("Email	:	"+email);
			else
				System.out.println("Invalid email");
		}
	}
	public static void main2(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("Enter email	:	");
			String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			String email = sc.nextLine();
			if( Pattern.matches(regex, email))
				System.out.println("Email	:	"+email);
			else
				System.out.println("Invalid email");
		}
	}
	public static void main1(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("Enter email	:	");
			String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			String email = sc.nextLine();
			
			
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			if( matcher.matches())
				System.out.println("Email	:	"+email);
			else
				System.out.println("Invalid email");
		}
	}
}
