/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Assignment3;

public abstract class cAccount {
    double amount;
    public abstract void deposit(double amt);
    public abstract void withdraw(double amt);
    public abstract void checkbalance();
}
