/*
 * Prasad Satpute
 * 
 * 
 */
package com.example;

import java.util.Scanner;

class bank
{
    
    public static double withdraw(double amount,double balance){
        return balance - amount;
    }
    
    public static double deposit(double deposit,double balance){
        return balance + deposit;
    }
    
    public static void displayBalance(double balance) {
        System.out.println("Your Balance is "+balance);
        System.out.println("Thank You For Banking");
    }
        
}

public class assignment4 {
    
    public static int menuList( ) {
	Scanner sc = new Scanner(System.in);
        System.out.println("0. Exit");
	System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Balance");
        System.out.print("Enter your choice : ");
	return sc.nextInt(); //will return your choice
    }
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to ABC Bank");
        String personName = "Salman Khan";
        double balance = 1000000;
        
        
        System.out.println("Name    :   "+personName);
        System.out.println("Balance :   "+balance);
        
        int option;
        
        while ((option = assignment4.menuList()) != 0) {            
            
            switch(option){
                case 1:
                    System.out.println("Enter Amount to Withdraw");
                    double amount = sc.nextDouble();
                    if(amount > balance)
                    {
                        balance = bank.withdraw(amount, balance);
                        System.out.println("Withdraw Successfull "+amount);
                        System.out.println("Thank You For Banking");
                    }
                    else
                    {
                        System.out.println("Balance insufficient");
                    }
                    break;
                case 2:
                    System.out.println("Enter Amount to Deposit");
                    double deposit = sc.nextDouble();
                    balance = bank.deposit(deposit, balance);
                    System.out.println("Deposit Successfull "+deposit);
                    System.out.println("Thank You For Banking");
                    break;
                case 3:
                    bank.displayBalance(balance);
                    break;
                default:
                    System.out.println("Please Enter correct Option");
            }
            
        }
        
    }
}
