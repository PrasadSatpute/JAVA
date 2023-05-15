package daily_driving_cost;

import java.util.Scanner;

public class Driving_Cost {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Daily Driving Cost");
		
		float TotalMile,Gasoline,Average,Parking,Tolls;
		
		System.out.print("Enter Total miles driven per day ");
		TotalMile = sc.nextFloat();
		System.out.print("Enter Cost per gallon of gasoline ");
		Gasoline = sc.nextFloat();
		System.out.print("Enter Average miles per gallon ");
		Average = sc.nextFloat();
		System.out.print("Enter Parking fees per day ");
		Parking = sc.nextFloat();
		System.out.print("Enter Tolls per day ");
		Tolls = sc.nextFloat();
		
		float CostofGasoline = (TotalMile / Average) * Gasoline;
		
		System.out.println("Your Daily Driving Cost : "+( CostofGasoline + Parking + Tolls));

	}

}
