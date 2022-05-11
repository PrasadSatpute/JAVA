
package com.multithread.sample;

import java.util.Iterator;

class MyThread implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++) {
			System.out.println("Value of i is "+i);
		}
    }
}


public class Multithread {

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
    }
    
}
