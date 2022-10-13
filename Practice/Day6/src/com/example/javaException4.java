/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.*;

public class javaException4 {
    public static void main(String[] args) {
        
        try {
            int number[] = new int[5];
            number[5] = 12;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index size is more than which is");
        }
    }
}
