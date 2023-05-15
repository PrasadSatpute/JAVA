package worldPopulation;

import java.util.Scanner;

public class EstimateWorldPopulation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double CWP,AWP,EWP;
		
		
		System.out.println("Estimated World Population Growth Rate");
		
		System.out.print("Enter The current World Population :");
		CWP = sc.nextDouble();
		System.out.print("Enter The Annual World Population :");
		AWP = sc.nextDouble();
		
		EWP = (((CWP - AWP) / AWP) * 100) / 1;
		
		System.out.println("Estimated World Population in five Year is : "+EWP);

	}

}
