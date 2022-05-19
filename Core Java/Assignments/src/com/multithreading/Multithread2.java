
package com.multithreading;


class MyThread1 implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("First Thread Start");
        System.out.println("Runnable Interface Implimented");
    }
}


public class Multithread2 {

    public static void main(String[] args) {
        MyThread1 mt = new MyThread1();
        Thread t = new Thread(mt);
        t.start();
    }
    
}
