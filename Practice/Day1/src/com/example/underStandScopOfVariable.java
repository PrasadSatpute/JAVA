/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


public class underStandScopOfVariable {
    
    public static int add(int num1, int num2){
        int res;
        res = num1 + num2;
        return res;
    }
    
    public static void main(String[] args) {
        int number1=10,number2=20,result;
        result=add(number1, number2);
        System.out.println("Result="+result);
    }

    
}
