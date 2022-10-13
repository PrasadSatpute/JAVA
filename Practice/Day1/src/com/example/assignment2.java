/*
 * Prasad Satpute
 * Menu Driven Program to simple calculator
 * 3-3-2022
 */
package com.example;

import java.util.Scanner;

public class assignment2 {
    public static int menuListCal( ) {
		Scanner sc = new Scanner(System.in);
                System.out.println("0. Exit");
		System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.print("Enter your choice : ");
		return sc.nextInt(); //will return your choice
	}
    public static int menuListPattern( ) {
		Scanner sc = new Scanner(System.in);
                System.out.println("0. Exit");
                System.out.println("1. Print pattern 1");
                System.out.println("2. Print pattern 2");
                System.out.println("3. Print pattern 3");
                System.out.println("Enter your Choice");
		return sc.nextInt();//will return your choice
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Simple Calculator");
        
        int ChoiceCalculator;
        
        while((ChoiceCalculator = assignment2.menuListCal()) != 0){
            
            if(ChoiceCalculator <= 4)
            {
                System.out.print("Number 1 = ");
                int number1 = sc.nextInt();
                System.out.print("Number 2 = ");
                int number2 = sc.nextInt();

                switch(ChoiceCalculator)
            {
                case 1:
                    System.out.println("Addition of "+number1+" + "+number2+" is "+(number1+number2));
                    break;
                case 2:
                    System.out.println("Subtraction of "+number1+" - "+number2+" is "+(number1-number2));
                    break;
                case 3:
                    System.out.println("Multiplication of "+number1+" * "+number2+" is "+(number1*number2));
                    break;
                case 4:	
                    if(number2==0)
                        System.out.println("Error!!! In Division denominator cannot be 0!");
                    else{
                        System.out.println("In Division of "+number1+" by "+number2+" quotient is "+(number1/number2)+" and remainder is "+(number1%number2));} 
                    break;
                default: System.out.println("Invalid choice");
                    break;
            }
            }
            else
            {
                System.out.println("Please Enter Correct Choice");
            }
                
            
        }
        
        
        System.out.println("--------------------*****------------------");
        
        System.out.println("Pattern by Using Loop");
        
        
        int patternChoice;
        
        while ((patternChoice = assignment2.menuListPattern()) != 0) {            
            
            if(patternChoice <= 3)
            {
                
                switch(patternChoice){
            case 1:
                System.out.println("Pattern 1");
        
                for (int i = 1; i <= 5; i++) {

                    for (int j = 1; j <= i; j++) {
                        System.out.print(+j+" ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Pattern 2");
        
                for (int i = 4; i >= 0; i--)
                {
                    int alphabet = 65;
                    for (int j = 0; j <= i; j++)
                    {
                        System.out.print((char) (alphabet + j) + " ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Pattern 3");
                int number = 1;
                for (int i = 1; i <= 5; i++) {

                    for (int j = 1; j <= i; j++) {
                        System.out.print(+number+" ");
                        if(number == 9){
                            number = 0;
                        }else{
                            number++;
                        }

                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Pleas Enter valid Choice");
                break;
        }
                
            }
            else
            {
                System.out.println("Please Enter Correct Choice");
            }
            
        }
        
        
        
        
        
    }
}
