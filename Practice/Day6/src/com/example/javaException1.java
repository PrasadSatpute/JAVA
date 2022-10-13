/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.*;

public class javaException1 {
    public static void main(String[] args) {
        int num1=5,num2=0;
        try
        {
            int result = num1/num2;
        }catch(ArithmeticException e)
        {
            System.out.println("Dividing by zero not allowed Entered");
            System.out.println("Enter the value of number 2 again");
            Scanner sc  = new Scanner(System.in);
            e.printStackTrace();
        }
    }
}
