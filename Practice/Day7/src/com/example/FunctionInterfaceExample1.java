/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class FunctionInterfaceExample1 implements iSAMInterface{

    @Override
    public void sammethod(String msg) {
        System.out.println(msg);
    }
    
    @Override
    public int hasCode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public static void main(String[] args) {
        FunctionInterfaceExample1 obj =new FunctionInterfaceExample1();
        obj.sammethod("Hello");
    }

    
    
}
