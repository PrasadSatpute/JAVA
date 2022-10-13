/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class FunctionInterfaceExample2 implements iAnotherInterface{

    @Override
    public void sammethod(String msg) {
        System.out.println(msg);
    }
    
    @Override
    public int hasCode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public void doIt() {
        System.out.println("Do It");
    }
    
    public static void main(String[] args) {
        FunctionInterfaceExample2 obj =new FunctionInterfaceExample2();
        obj.doIt();
        obj.sammethod("Hello There");
    }

    

    
    
}
