
package com.multithread.Synchronization;

class TotalEarning extends Thread
{
    int total= 0;

    @Override
    synchronized public void run() {
        for (int i = 0; i < 10; i++) {
            total = total + 100;
        }
    }
}


public class MovieBookApp {
    public static void main(String[] args) {
        TotalEarning te = new TotalEarning();
        te.start();
        
        System.out.println("Total Erning = "+te.total+"rs");
    }
}
