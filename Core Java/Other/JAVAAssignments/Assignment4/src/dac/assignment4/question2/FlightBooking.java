package dac.assignment4.question2;


import java.util.Scanner;


class FlightBooking {
	
	
	int choice = 1;
	
	public static Scanner sc = new Scanner(System.in);
	
	public void ConfirmeSeat(int confirmation) {
		
		if(confirmation == 1)
		{
			System.out.println("Seat is Confirm.");
		}
		else
		{
			System.out.println("Seat is not Confirm");
		}
		
	}
	
	public void choose(){
		while(choice != 0) {
		
			System.out.println("Please Choose Flight Options.");
			System.out.println("1. Flight Booking");
			System.out.println("2. Flight Details");
			System.out.print("Enter Your Choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				int flightchoose;
				System.out.println("Choose Flight Class");
				System.out.println("1. First Class 2. Economy Class");
				flightchoose = sc.nextInt();
					switch(flightchoose) {
					
					case 1:
						System.out.println("Welcome To First Class");
						System.out.println("Do you want Confirm your Seat");
						System.out.println("1. Yes 2. No ");
						int ConfmSeat = sc.nextInt();
						if(ConfmSeat == 1)
						{
							ConfirmeSeat(1);
							break;
						}
						else
							if(ConfmSeat == 2)
							{
								ConfirmeSeat(2);
								break;
							}
							else
							{
								System.out.println("Please Enter Valid Entery");
							}
						choice = 0;
						break;
					
					case 2:
						System.out.println("Welcome To Economy Class");
						choice = 0;
						break;
					
					default:
						System.out.println("Please Enter Correct Option");
						break;
					}
				break;
			
			case 2:
				break;
		
			default:
				choice = 0;
			
			}
			
		}
	}

}