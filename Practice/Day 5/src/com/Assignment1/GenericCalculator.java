/*
 * Author       : Prasad Satpute
 * Date         : 09/03/2022
 * Program      : Simple Calculator Using Generic Method
 * Description  : 
 */
package com.Assignment1;

import java.util.Scanner;

public class GenericCalculator {
    
    static Scanner sc=new Scanner(System.in);
    
    public <T extends Number> double add(T n1,T n2){
        return n1.doubleValue()+n2.doubleValue();
    }
    public <T extends Number> double sub(T n1,T n2){
        return n1.doubleValue()-n2.doubleValue();
    }
    public <T extends Number> double multiplication(T n1,T n2){
        return n1.doubleValue()*n2.doubleValue();
    }
    public <T extends Number> double division(T n1,T n2){
        return n1.doubleValue()/n2.doubleValue();
    }
    
    public static int menuOption(){
        System.out.println("1.addition 1\n2.substraction 2\n3.multiplication3\n4.devide \n5.Exit");
        return sc.nextInt();
    }
    
}
