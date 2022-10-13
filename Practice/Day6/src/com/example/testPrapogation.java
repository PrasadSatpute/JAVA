/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class testPrapogation {
    public void m(){
        int data = 50/0;
    }
    public void n(){
        m();
    }
    public void p(){
        try {
            n();
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }
    public static void main(String[] args) {
        testPrapogation obj = new testPrapogation();
        obj.p();
        System.out.println("Normal Flow");
    }
}
