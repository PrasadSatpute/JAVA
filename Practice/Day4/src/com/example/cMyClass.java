/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class cMyClass implements iShape{

    @Override
    public void method1() {
        System.out.println("I am method 1");
    }

    @Override
    public void method2() {
        System.out.println("I am method 2");
    }

    @Override
    public void method3() {
        System.out.println("I am method 3");
    }
    
    public static void main(String[] args) {
        new cMyClass().method1();
        new cMyClass().method2();
        new cMyClass().method3();
    }
    
}
