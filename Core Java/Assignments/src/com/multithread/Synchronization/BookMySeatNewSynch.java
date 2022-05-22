
package com.multithread.Synchronization;

class BookTheaterSeat1
{
    int totalSeat = 10;
    synchronized void BookSeats(int seats){
        if(totalSeat >= seats){
            System.out.println(Thread.currentThread().getName()+" Seats Booked Successfully");
            totalSeat = totalSeat - seats;
            System.out.println("Seats = "+totalSeat);
        }
        else{
            System.out.println(Thread.currentThread().getName()+" Sets are no Booked");
        }
    }
}

class MyNewThread implements Runnable
{
    BookTheaterSeat1 bts;
    int seats;

    public MyNewThread(BookTheaterSeat1 bts, int seats) {
        this.bts = bts;
        this.seats = seats;
    }

    @Override
    public void run() {
        bts.BookSeats(seats);
    }
}

public class BookMySeatNewSynch {
    public static void main(String[] args) {
        BookTheaterSeat1 b1 = new BookTheaterSeat1();
        MyNewThread mt1 = new MyNewThread(b1, 5);
        MyNewThread mt2 = new MyNewThread(b1, 7);
        Thread t1 = new Thread(mt1,"First");
        Thread t2 = new Thread(mt2,"Second");
        t2.start();
        t1.start();
        
    }
}
