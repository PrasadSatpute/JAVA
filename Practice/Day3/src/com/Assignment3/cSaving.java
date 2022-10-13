/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Assignment3;

/**
 *
 *  // constructor will initialize the amount  --> 
 * For saving account  initial amount  is 1000
        // override abstract method of base class
 */
public class cSaving extends cAccount{

    public cSaving() {
        super.amount=1000;
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
