/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Synchronizetion;

public class Caller implements Runnable{
    Thread t;
    String message;
    Callme target;

    public Caller(Callme tar, String msg) {
        this.target = tar;
        this.message = msg;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized(target){
            target.call(message);
        }
    }
}
