
package com.multithread.sample;

import java.util.*;

class MyThread1 implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++) {
			System.out.println("Value of i is "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    }
}


public class Multithread2 {

    public static void main(String[] args) {
        MyThread1 mt = new MyThread1();
        Thread t = new Thread(mt);
        t.run();
        MyThread1 mt2 = new MyThread1();
        Thread t1 = new Thread(mt2);
        t1.start();

    }
    
}
