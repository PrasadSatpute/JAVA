package com.Examples.Lambda.Multithreading;

class PrintThread {

    public void PrintThreadSiq() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
public class ThreadDemo2 {

    public static void main(String[] args) {
        
        Runnable runnable = new Runnable() {    //This is the Annonymous Class
            @Override
            public void run() {
                PrintThread pt = new PrintThread();
                pt.PrintThreadSiq();
            }
        };
        //If we cant create Thread Class 
        //then It will run with main Thread Class
        runnable.run(); 
        
        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
