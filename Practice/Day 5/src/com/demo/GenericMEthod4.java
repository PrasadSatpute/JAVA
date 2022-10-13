/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

/**
 * to use N in generic types
 * 
 * @author Mahesh
 */
public class GenericMEthod4 {
  
    public <T extends Number> double add(T n1,T n2){
        return n1.doubleValue()+n2.doubleValue();
    }
    
    public static void main(String[] args) {
        int n1=10;
        int n2=6;
        double d1=19,d2=99;
        
        GenericMEthod4 g1=new  GenericMEthod4();
        System.out.println("addition is "+ g1.add(n1, n2));
        System.out.println("addition is "+ g1.add(d1, d2));
        
    }
}
