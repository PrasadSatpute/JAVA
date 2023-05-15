package dac.assignment4.question2;

import java.util.Scanner;



public class Program {
	
	public enum FlightBookingOperation {
		EXIT,BOOKSEAT,CHEACKSEAT
	}
	
	public enum FlightClass {
		FirstClass,EconomyClass
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println(FlightBookingOperation.values()[0]);
		
		boolean[] arrSeats = new boolean[10];
		
		int countbookFirstClass = 0;
		int countbookEconomyClass = 5;
		
		for(int i = 0; i < 10; i++ ) {
			arrSeats[i] = false;
		}
		
		int choice = 1;
		
		while(choice != 0) {
			
			System.out.println("Welcome Flight Booking");
			System.out.println("1. Book Seat");
			System.out.println("2. Check Seat");
			System.out.println("3. Exit");
			
			int ChoiceOptions = sc.nextInt();
			
			switch(ChoiceOptions) {
				
			case 1 :
				System.out.println("Choose Class");
				System.out.print("1. First Class 2. Economy Class");
				
				int chooseclass = sc.nextInt();
				
					switch(chooseclass) {
					
					case 1:
						System.out.println("Welcome to First Class");
						arrSeats[countbookFirstClass] = true;
						countbookFirstClass++;
						break;
					
					case 2:
						System.out.println("Welcome to Economy Class");
						arrSeats[countbookEconomyClass] = true;
						countbookFirstClass++;
						break;
						
					default:
						System.out.println("Choose Correct Option");
						break;
					
					}
				
				break;
			
			case 2: 
				
				System.out.println("First Class Seats");
				for(int i = 0; i < 5; i++) {
					if(arrSeats[i] == true) {
						System.out.println(" Booked ");
					}
					else {
						System.out.println(" Available ");
					}
						
				}
				System.out.println("Economy Class Seats");
				for(int i = 5; i < 10; i++) {
					if(arrSeats[i] == true) {
						System.out.println(" Booked ");
					}
					else {
						System.out.println(" Available ");
					}
				}
				break;
			
			case 3:
				System.out.println("Thank You");
				choice = 0;
				break;
				
			default:
				System.out.println("Thank You");
				choice = 0;
				break;
				
			}
			
		}
		

	}

	

}
