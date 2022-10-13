/*
 * Author       : Prasad Satpute
 * Date         : 07/03/2022
 * Program      : Static Polymorphism
 * Description  : [Method overloading ]
 */
package com.Assignment3;


class Calculator {
    int add(int a, int b) {
        return a + b;
    }
 
    double add(double a, double b) {
        return a + b;
    }
    
    int sub(int a, int b) {
        return a - b;
    }
 
    double sub(double a, double b) {
        return a - b;
    }
    
    int multi(int a, int b) {
        return a * b;
    }
 
    double multi(double a, double b) {
        return a * b;
    }
    
    int division(int a, int b) {
        return a / b;
    }
 
    double division(double a, double b) {
        return a / b;
    }
}


public class StaticPolymorphismCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.add(2.0, 3.0));
        System.out.println(calculator.sub(2, 3));
        System.out.println(calculator.sub(2.0, 3.0));
        System.out.println(calculator.multi(2, 3));
        System.out.println(calculator.multi(2.0, 3.0));
        System.out.println(calculator.division(2, 3));
        System.out.println(calculator.division(2.0, 3.0));
    }
}
