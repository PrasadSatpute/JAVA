
package com.multithreading;

import java.util.*;

class MyThread5 implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    }
}


public class Multithread5 {

    public static void main(String[] args) {
        MyThread5 mt = new MyThread5();
        Thread t = new Thread(mt,"1");
        t.start();
        MyThread5 mt2 = new MyThread5();
        Thread t1 = new Thread(mt2,"2");
        t1.start();

    }
    
}
