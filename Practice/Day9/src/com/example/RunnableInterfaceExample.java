/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class RunnableInterfaceExample implements Runnable{

    Thread t1;

    public RunnableInterfaceExample() {
        t1 = new Thread(this);
        t1.start();
    }
    
    
    @Override
    public void run() {
        System.out.println("Method is called through runnable intrface");
    }
    
    public static void main(String[] args) {
        RunnableInterfaceExample obj = new RunnableInterfaceExample();
    }
}
