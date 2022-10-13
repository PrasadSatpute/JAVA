/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class switchExample {
    public static int add(int num1, int num2)
    {
        return num1+num2;
    }
    public static void main(String []args)
    {
        String ans="Y";
        int choice;
        int number1,number2,result;
        Scanner Sc=new Scanner(System.in);
        do
        {
            System.out.println("1 Addition");
            System.out.println("2 Subtraction");
            System.out.println("3 Multiplication");
            System.out.println("4 Division");
            System.out.println("Enter any two numbers");
            number1=Sc.nextInt();
            number2=Sc.nextInt();
            System.out.print("Enter your choice (1..4)");
            choice=Sc.nextInt();
        
            switch(choice)
            {
            case 1:
                    result=add(number1,number2);
                    System.out.println("Addition="+result);
                    break;
            case 2:
                    result=number1-number2;
                    System.out.println("Subtraction="+result);
                    break;
            case 3:
                    result=number1*number2;
                    System.out.println("Multiplication="+result);
                    break;
            case 4:
                    result=number1/number2;
                    System.out.println("Division="+result);
                    break;
            default:
                    System.out.println("Wrong choice");
        }
            System.out.println("Do you wish to continue(y/n)");
            ans=Sc.next();
       } while(ans.equals("Y")||ans.equals("y"));     
    }
}
