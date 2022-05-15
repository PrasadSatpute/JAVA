
package com.multithread.deadlock;

import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadDemo1 extends Thread{

    private Object object1;
    private Object object2;
    
    
    public ThreadDemo1(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }
    

    @Override
    public void run() {
        synchronized(object1){
            try {
                System.out.println(object1+" Locke First Object and Waiting for Second Object");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadDemo1.class.getName()).log(Level.SEVERE, null, ex);
            }
            synchronized(object2){
                System.out.println(object2+" Locke First Object and Second Object");
            }
        }
    }
    
}

class ThreadDemo2 extends Thread{

    private String object1;
    private String object2;
    
    
    public ThreadDemo2(String object1, String object2) {
        this.object1 = object1;
        this.object2 = object2;
    }
    

    @Override
    public void run() {
        synchronized(object2){
            try {
                System.out.println(object2+" Locke Second Object and Waiting for First Object");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadDemo1.class.getName()).log(Level.SEVERE, null, ex);
            }
            synchronized(object1){
                System.out.println(object1+" Locke First Object and Second Object");
            }
        }
    }
    
}

public class DeadloackDemo {
    public static void main(String[] args) {
        String object1 = "Thread Object 1";
        String object2 = "Thread Object 2";
        
        ThreadDemo1 td1 = new ThreadDemo1(object1, object2);
        td1.start();
        ThreadDemo2 td2 = new ThreadDemo2(object1, object2);
        td2.start();
    }
}
