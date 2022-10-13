/*
 * Author       : Prasad Satpute
 * Date         : 07/03/2022
 * Program      : Achieve polymorphism
 * Description  : [Method overriding]
 */
package com.Assignment3;

import java.util.Scanner;

public class TestPolymorphism {
    
    Scanner sc = new Scanner(System.in);
    
    public int OpenAccount(){
        System.out.println("1. Saving Account");
        System.out.println("2. Current Account");
        return sc.nextInt();
    }
    
    public int OperationsOnAccount(){
        System.out.println("1. Deposit Amount");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        return sc.nextInt();
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        TestPolymorphism tp = new TestPolymorphism();
        
        int openAccountOption = tp.OpenAccount();
        
        cAccount account;
        
        if(openAccountOption == 1)
        {
            account = new cSaving();
        }
        else
        {
            account = new cCurrent();
        }
        
        int OperationsOnAccountOptions;
        
        while ((OperationsOnAccountOptions = tp.OperationsOnAccount()) != 0) {
            
            
            switch(OperationsOnAccountOptions)
            {
                case 1:
                    System.out.println("Enter Ammount to Deposit : ");
                    account.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter Ammount to Withdraw : ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 3:
                    account.checkbalance();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
            
        }
        
    }
    
}
