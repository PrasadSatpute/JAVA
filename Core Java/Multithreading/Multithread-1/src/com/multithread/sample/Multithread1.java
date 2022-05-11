
package com.multithread.sample;


class MyThread implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("First Thread Start");
        System.out.println("Runnable Interface Implimented");
    }
}


public class Multithread1 {

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
    }
    
}
