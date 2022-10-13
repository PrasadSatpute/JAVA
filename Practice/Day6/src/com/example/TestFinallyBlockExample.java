/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class TestFinallyBlockExample {
    public static void main(String[] args) {
        try {
            int data = 25/5;
            System.out.println(data);
        } catch (Exception e) {
        }finally{
            System.out.println("Finally Block");
        }
    }
}
