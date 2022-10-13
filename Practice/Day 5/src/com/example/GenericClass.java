/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author AVENGER'S
 */
public class GenericClass<T>{
    public T tvariable;
    

    public T getTvariable() {
        return tvariable;
    }

    public void setTvariable(T tvariable) {
        this.tvariable = tvariable;
    }
    
    public static void main(String []args)
    {
        GenericClass<Integer> intobj=new GenericClass<>();
        GenericClass<Double>  doubleobj=new GenericClass<>();
        GenericClass<String>  stringobj=new GenericClass<>();
        intobj.setTvariable(10);
        doubleobj.setTvariable(12.35);
        stringobj.setTvariable("AAA");
        System.out.println("Value of variable="+intobj.getTvariable());
        System.out.println("Value of variable="+doubleobj.getTvariable());
        System.out.println("Value of variable="+stringobj.getTvariable());
    }
}