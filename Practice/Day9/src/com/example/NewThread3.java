/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NewThread3 implements Runnable{

    Thread t;
    String threadName;
    
    public NewThread3(String threadName){
        this.threadName = threadName;
        t = new Thread(this,threadName);
        System.out.println("New Thread"+t.getName());
        t.start();
    }
    
    @Override
    public void run() {
        try {
        for (int i = 5; i > 0; i--) {
            System.out.println(threadName+i);
            
                Thread.sleep(1000);
            
        }
        } catch (InterruptedException ex) {
             System.out.println(threadName+"Interruption");   
            }
        System.out.println("Exiting");
    }
    
}
