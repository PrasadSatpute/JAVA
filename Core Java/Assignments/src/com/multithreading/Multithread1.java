
package com.multithreading;


class MyThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("First Thread Start");
        System.out.println("Thread Class Extended");
    }
}


public class Multithread1 {

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
    
}
