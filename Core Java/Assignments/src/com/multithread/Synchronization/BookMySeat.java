
package com.multithread.Synchronization;

class BookTheaterSeat
{
    int totalSeat = 10;
    synchronized void BookSeats(int seats){
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

class MyThread1 extends Thread
{
    BookTheaterSeat bts;
    int seats;

    public MyThread1(BookTheaterSeat bts, int seats) {
        this.bts = bts;
        this.seats = seats;
    }

    @Override
    public void run() {
        bts.BookSeats(seats);
    }
}
class MyThread2 extends Thread
{
    BookTheaterSeat bts;
    int seats;

    public MyThread2(BookTheaterSeat bts, int seats) {
        this.bts = bts;
        this.seats = seats;
    }

    @Override
    public void run() {
        bts.BookSeats(seats);
    }
}

public class BookMySeat {
    public static void main(String[] args) {
        BookTheaterSeat b1 = new BookTheaterSeat();
        MyThread1 t1 = new MyThread1(b1, 5);
        BookTheaterSeat b2 = new BookTheaterSeat();
        MyThread2 t2 = new MyThread2(b2, 7);
        
        t1.start();
        t2.start();
    }
}
