/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class TestDefaultInterfaceMethod implements iDrawable{

    @Override
    public void draw() {
        System.out.println("Rectangle is drawing");
    }

    @Override       // if we create this method still it will Default
    public void message() {
        iDrawable.super.message();
    }
    
    public static void main(String[] args) {
        TestDefaultInterfaceMethod obj = new TestDefaultInterfaceMethod();
        obj.draw();
        obj.message();
    }
    
}
