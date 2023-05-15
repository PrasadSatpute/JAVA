package org.sunbeam.test;
public class Program {
	//int num1 = 10;
	//int num2 = 20;
	private static int sum(int num1, int num2) {	//Called method
		return num1 + num2;	//return is a jump statement
	}
	
	/* private static int sum(int num1, int num2) {
		int result = num1 + num2;	//Initialization
		return result;
	} */
	
	/* private static int sum(int num1, int num2) {
		int result = 0;
		result = num1 + num2;	//Assignment
		return result;
	} */
	
	public static void main(String[] args) {	//Calling Method
		//int result = sum( 10, 20 );
		int result = Program.sum( 10, 20 );	//Method call
		System.out.println("Result	:	"+result);
	}
	public static void main1(String[] args) {
		int result = 10 + 20;
		System.out.println(result);
	}
}
