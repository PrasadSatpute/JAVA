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
public class GenericClass <T> {
  private T tVar;

    public T gettVar() {
        return tVar;
    }

    public GenericClass() {
        
    }

    public void settVar(T tVar) {
        this.tVar = tVar;
    }
  
    public static void main(String[] args) {
        GenericClass <Integer> i1=new GenericClass<>();
        i1.settVar(10);
        System.out.println("int var"+i1.gettVar());
        GenericClass <Double> d1=new GenericClass<>();
        d1.settVar(10.52);
        System.out.println("int var"+d1.gettVar());
        GenericClass <Float> f1=new GenericClass<>();
        f1.settVar(10.54f);
        System.out.println("int var"+f1.gettVar());
   
    
    
    }
    
    
    
    
}
