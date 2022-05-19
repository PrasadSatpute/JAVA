
package com.multithreading;

import java.util.*;

class MyThread4 implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++) {
			System.out.println("Value of i is "+i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    }
}


public class Multithread4 {

    public static void main(String[] args) {
        MyThread4 mt = new MyThread4();
        Thread t = new Thread(mt);
        t.start();
        MyThread4 mt2 = new MyThread4();
        Thread t1 = new Thread(mt2);
        t1.start();

    }
    
}
