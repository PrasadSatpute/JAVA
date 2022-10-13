/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Synchronizetion;

public class Callme{
     void call(String msg){     //Without synchronized
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e)
        {
            System.out.print("Intreptted");
        }
        System.out.println("]");
    }
}
