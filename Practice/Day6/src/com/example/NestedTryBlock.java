/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            
            try {
                int num = 30/0;
            } catch (Exception e) {
                System.out.println("ArithmeticException");
            }
            try {
                int []num  = new int[5];
                num[5] = 12;
            } catch (Exception e) {
                System.out.println("ArrayIndexOutOfBoundsException");
            }
            
        } catch (Exception e) {
            System.out.println("Outer catch");
        }
    }
}
