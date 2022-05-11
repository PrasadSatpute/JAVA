package com.synchronization.multithreading;

class BookTheaterSeat {
//	private int totatlSeats = 100;
	private int totatlSeats = 10;
	 void BookSeat(int seats) 
	{
		if(totatlSeats >= seats) 
		{
			totatlSeats = totatlSeats - seats;
			System.out.println(seats+" Seats Booked Successfully");
			System.out.println("Seats Left = "+totatlSeats);
		}
		else
		{
			System.out.println(seats+" Seats can not be Booked");
			System.out.println("Seats Left = "+totatlSeats);
		}
	}
}


public class MovieBookApp extends Thread{
	
	
	static BookTheaterSeat bookTheaterSeats;
	int seats;


	@Override
	public void run() {
		bookTheaterSeats.BookSeat(seats);
	}
	
	public static void main(String[] args) {
		
		bookTheaterSeats = new BookTheaterSeat();
		
		MovieBookApp user1 = new MovieBookApp();
		user1.seats = 7;
		user1.start();
		
		MovieBookApp user2 = new MovieBookApp();
		user2.seats = 6;
		user2.start();
		
		
//		for (int i = 1; i < 20; i++) {
//			MovieBookApp user = new MovieBookApp();
//			user.seats = i*2;
//			user.start();
//		}	
	}
}
