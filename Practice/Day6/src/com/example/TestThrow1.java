/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class TestThrow1 {
    public static void validate(int number)
    {
        if(number<18)
        {
            throw new ArithmeticException("Age is not Valid");
        }
        else{
            throw  new ArithmeticException("Age is Valid");
        }
    }
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        age = sc.nextInt();
        validate(age);
    }
}
