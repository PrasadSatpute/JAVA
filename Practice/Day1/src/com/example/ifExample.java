/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ifExample {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        number = sc.nextInt();
        if(number > 10)
        {
         System.out.println("Number is greater than 10 " +number);   
        }
        else{
            System.out.println("Number is less than 10");
        }
        System.out.println("Number = " +number);
    }
    
}
