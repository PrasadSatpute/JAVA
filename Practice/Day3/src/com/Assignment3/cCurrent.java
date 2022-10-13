/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Assignment3;

/**
 *
 * // constructor will initialize the amount  --> 
 * For current account  initial amount  is 3000

       // override abstract method of base class  
 */
public class cCurrent extends cAccount{

    public cCurrent() {
        super.amount = 3000;
    }

    
    @Override
    public void deposit(double amt) {
        this.amount = amount + amt;
        }

    @Override
    public void withdraw(double amt) {
        this.amount = amount - amt;
        }

    @Override
    public void checkbalance() {
        System.out.println("Balance = "+amount);
        
        }
    
}
