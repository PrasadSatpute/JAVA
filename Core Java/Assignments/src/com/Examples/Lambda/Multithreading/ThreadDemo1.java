package com.Examples.Lambda.Multithreading;


class PrintThread1 {

    public void PrintThreadSiq() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" "+Thread.currentThread().getName());
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

class MyFirstThread1 implements Runnable {

    PrintThread1 pt;

    public MyFirstThread1(PrintThread1 pt) {
        this.pt = pt;
    }
    
    @Override
    public void run() {
        pt.PrintThreadSiq();
    }
}

public class ThreadDemo1 {

    public static void main(String[] args) {

        PrintThread1 pt = new PrintThread1();
//      We Have To create Object of the Runnable class
        MyFirstThread1 mt = new MyFirstThread1(pt);
//      Now We have to Create Thread Class Object and pass the Runnable class Object refernce
        Thread t = new Thread(mt);
//      Start the Thread
        t.start();

    }
}
