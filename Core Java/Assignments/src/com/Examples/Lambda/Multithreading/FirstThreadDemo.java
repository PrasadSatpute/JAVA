
package com.Examples.Lambda.Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FirstThreadDemo {
    public static void main(String[] args) {
        //FirstThread
        
        Runnable thread1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(250);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(thread1);
        t1.start();
        
        
        Runnable thread2 = () -> {
              try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 2 -> "+ (i * 2));
                    Thread.sleep(250);
                }
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            };
        
        Thread t2 = new Thread(thread2);
        t2.start();
    }
}
