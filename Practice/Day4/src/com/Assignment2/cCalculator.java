/*
 * Author       : Prasad Satpute
 * Date         : 08/03/2022
 * Program      : Calculator using interface
 * Description  : 
 */
package com.Assignment2;

import java.util.Scanner;

public class cCalculator implements iCalculator{
    
    static Scanner sc = new Scanner(System.in);
    
    
    
    public static void main(String[] args) {
        
        int number1 = 10;
        int number2 = 20;
        int choice;
        
        System.out.println("Simple Calculator");
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Multi");
        System.out.println("4. Division");
        
        switch(choice=sc.nextInt()){
            case 1:
                System.out.println("Enter Number 1 = ");
                number1 =sc.nextInt();
                System.out.println("Enter Number 2 = ");
                number2 =sc.nextInt();
                System.out.println("Addition is"+iCalculator.add(number1, number2));
                break;
            case 2:
                System.out.println("Enter Number 1 = ");
                number1 =sc.nextInt();
                System.out.println("Enter Number 2 = ");
                number2 =sc.nextInt();
                System.out.println("Subtraction is"+iCalculator.sub(number1, number2));
                break;
            case 3:
                System.out.println("Enter Number 1 = ");
                number1 =sc.nextInt();
                System.out.println("Enter Number 2 = ");
                number2 =sc.nextInt();
                System.out.println("Multiplication is"+iCalculator.mult(number1, number2));
                break;
            case 4:
                System.out.println("Enter Number 1 = ");
                number1 =sc.nextInt();
                System.out.println("Enter Number 2 = ");
                number2 =sc.nextInt();
                System.out.println("Division is"+iCalculator.sub(number1, number2));
                break;
        }
        
    }
}
