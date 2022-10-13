/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class TestThows {
    public static int divideNum(int n, int m) throws ArithmeticException{  
        int div = m / n;  
        return div;
    }  
    public static void main(String[] args) {
        TestThows obj = new TestThows();  
        try {
            int result = obj.divideNum(10, 0);
        } catch (Exception e) {
            System.out.println("\nNumber cannot be divided by 0");  
        }
        
    }
}
