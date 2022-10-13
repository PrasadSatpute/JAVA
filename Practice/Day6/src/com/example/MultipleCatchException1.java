/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class MultipleCatchException1 {
    public static void main(String[] args) {
        try {
            int number[] = new int[5];
            number[5] = 30/0;       //ArithmeticException
            number[5] = 30/5;       //ArrayIndexOutOfBoundsException
        
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
    }
}
