/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.*;

public class javaException3 {
    public static void main(String[] args) {
        String num1 = "ABC",num2 = "12";
        int inum1,inum2,result;
        try
        {
           inum1=Integer.parseInt(num1);
           inum2=Integer.parseInt(num2);
           result=inum1+inum2;
            System.out.println("Result of Addition="+result);
        }catch(NumberFormatException e)
        {
            System.out.println("Numbers must be numeric value");
            num1="10";
            e.printStackTrace();
        }
    }
}
