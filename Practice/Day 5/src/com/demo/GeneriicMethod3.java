/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

/**
 *
 * @author Mahesh
 */
public class GeneriicMethod3 {
    public <T extends Number> double add (T one, T two)
    {   
        return one.doubleValue()+two.doubleValue();
    }
    
    public static void main(String []args)
    {
        int num1=10, num2=20;
        double dnum1=24.56, dnum2=56.24;
        GeneriicMethod3 obj=new GeneriicMethod3();
        System.out.println("Addition of integer numbers="+obj.add(num1, num2));
        System.out.println("Addition of double numbers="+obj.add(dnum1, dnum2));
        
    }
}
