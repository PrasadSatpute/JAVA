package bmi;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float Height,Weight;
		
		System.out.println("BODY MASS INDEX");
		
		System.out.print("Enter the Weight in Kilogram : ");
		Height = sc.nextFloat();
		
		System.out.print("Enter the Height in Meter : ");
		Weight = sc.nextFloat();
		
		float BMI = (Height) / (Weight * Weight);
		
		if(BMI < 18.5)
		{
			System.out.println("Underweigth");
		}
		if(BMI >= 18.5 && BMI <= 25.9)
		{
			System.out.println("Normal");
		}
		if(BMI >= 25 && BMI <= 29.9)
		{
			System.out.println("Overweight");
		}
		if(BMI >= 30)
		{
			System.out.println("Obeses");
		}
		

	}

}
