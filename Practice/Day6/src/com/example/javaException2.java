/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class javaException2 {
    public static void main(String[] args) {
        String sval = null;
        try {
            System.out.println("Lenght of string is = "+sval.length());
        } catch (NullPointerException e) {
            System.err.println("Initialize value of string");
            e.printStackTrace();
        }
        
    }
}
