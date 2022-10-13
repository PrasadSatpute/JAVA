/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class ExtendThread extends NewThread2{
    public static void main(String[] args) {
        NewThread2 thread = new NewThread2("New thread is born");
        thread.run();
    }

    public ExtendThread(String msg) {
        super(msg);
    }
}
