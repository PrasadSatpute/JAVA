/*
 * Prasad Satpute 
 * 3-3-2022
 * Write a program in java that will print your name and emailaddress
 */
package com.example;

import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        String name = "Prasad Satpute";
        String email = "prasadsatpute000@gmail.com";
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three Numbers");
        System.out.print("Num 1 = ");
        int num1 = sc.nextInt();
        System.out.print("Num 2 = ");
        int num2 = sc.nextInt();
        System.out.print("Num 3 = ");
        int num3 = sc.nextInt();
        
        if(num1 > num2 && num1 > num3)
        {
            System.out.println("Number 1 is Biggest");
        }
        else{
            if(num2 > num1 && num2 > num3){
                System.out.println("Number 2 is Biggest");
            }
            else{
                System.out.println("Number 3 is Biggest");
            }
        }
    }
    
}



