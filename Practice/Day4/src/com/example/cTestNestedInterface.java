/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class cTestNestedInterface implements iMyNestedInerface.iInnerinterface{

    @Override
    public void innerinterfacemethod() {
        
    }
    
    public static void main(String[] args) {
        iMyNestedInerface.iInnerinterface obj = new cTestNestedInterface();
        obj.innerinterfacemethod();
    }
    
}
