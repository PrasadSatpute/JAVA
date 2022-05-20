
package com.multithreading;

import java.util.*;

class MyThread6 implements Runnable
{
    int threadNumber;

    public MyThread6(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            if(i%2 == threadNumber){
                try {
                        wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                }
            }
            System.out.println("");
            notifyAll();
	}
    }
}


public class Multithread6 {

    public static void main(String[] args) {
        MyThread6 mt = new MyThread6(1);
        Thread t = new Thread(mt);
        t.start();
        MyThread6 mt2 = new MyThread6(0);
        Thread t1 = new Thread(mt2);
        t1.start();

    }
    
}
