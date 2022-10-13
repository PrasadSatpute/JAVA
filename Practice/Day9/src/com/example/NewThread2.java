/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class NewThread2 {

    public NewThread2(String msg) {
        System.out.println(msg);
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Child Thread : "+i);
                   Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Tnterrupt Thread");
            }
            System.out.println("Child thread is exiting");
        }
    }
    
}
