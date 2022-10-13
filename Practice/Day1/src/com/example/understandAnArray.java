/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class understandAnArray {
    public static void doublearry(int []num){
        for (int i = 0; i < num.length; i++) {
            num[i]=2*num[i];
        }
    }
    public static void main(String[] args) {
        int number[] = new int[5];
        for (int i = 0; i < 5; i++) {
            number[1]=i+1;
        }
        
        //printing original array
        System.out.println("Original Array");
            for (int i = 0; i < 5; i++) {
            System.out.println(number[i]);
        }
            doublearry(number);
            System.out.println("Double Array");
            for (int i = 0; i < 5; i++) {
            System.out.println(number[i]);
        }
    }
}
