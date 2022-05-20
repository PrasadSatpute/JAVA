
package com.multithread.Synchronization;

class BookSeat
{
    int totalSeat = 10;

    synchronized void BookSeat(int seats) {
        if(totalSeat >= seats){
            System.out.println("Seats Booked Successfully");
            totalSeat = totalSeat - seats;
            System.out.println("Seats = "+totalSeat);
        }
        else{
            System.out.println("Sets are no Booked");
        }
    }
}


public class MovieBookAppSynch extends Thread{

    static BookSeat b;
    int seats;
    
    @Override
    public void run() {
        b.BookSeat(seats);
    }
    
    public static void main(String[] args) {
        b = new BookSeat();
        
        MovieBookAppSynch abc = new MovieBookAppSynch();
        abc.seats = 7;
        MovieBookAppSynch xyz = new MovieBookAppSynch();
        xyz.seats = 6;
        
        
        abc.start();
        xyz.start();
        
    }
}
