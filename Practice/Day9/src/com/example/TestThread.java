/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class TestThread {
    public static void main(String[] args) {
        Newthread thread = new Newthread("The new thread is bourn but not runnig");
        thread.start();
    }
}
