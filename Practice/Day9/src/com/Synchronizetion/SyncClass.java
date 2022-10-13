/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Synchronizetion;

import com.Synchronizetion.Callme;
import com.Synchronizetion.Caller;

public class SyncClass {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller obj1 = new Caller(target, "Hello");
        Caller obj2 = new Caller(target, "Synchronization");
        Caller obj3 = new Caller(target, "World");
    }
}
