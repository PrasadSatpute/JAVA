/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class scop_variable2 {

    public static void main(String[] args) {
        int i = 10;
        {
            i = 20;
            System.out.println("Value of i = "+i);
        }
        System.out.println("Value of i = "+i);
    }
    
}
