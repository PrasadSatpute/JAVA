/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class copyConstructorExample {
    public static void main(String []args)
    {
        person p1=new person();
        p1.setName("Sukhiram");
        p1.setAge(23);
        person p2=new person();
        p2=p1;          //copy constructor is getting called
        p1.showData();
        p2.showData();
        
    }
}