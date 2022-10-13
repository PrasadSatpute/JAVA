/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class Newthread extends Thread{
    public Newthread(String msg){
        System.out.println(msg);
    }
    public void run(){
        System.out.println("Thread is in runnable");
    }
}
