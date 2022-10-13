/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypack;

public class SomeClass {
    void message(){
        System.out.println("Default method withou access specifier");
    }
    
    public static void main(String[] args) {
        SomeClass obj = new SomeClass();
        obj.message();
        new SomeClass().message();
    }
}
