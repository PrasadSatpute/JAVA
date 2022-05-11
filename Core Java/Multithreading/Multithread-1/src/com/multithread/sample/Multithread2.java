
package com.multithread.sample;


class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("First Thread Start");
        System.out.println("Thread Class Extended");
    }
}


public class Multithread2 {

    public static void main(String[] args) {
        MyThread1 mt = new MyThread1();
        mt.start();
    }
    
}
