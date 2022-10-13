/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

 class TestAccessSpecifier {
    private int data = 40;

    /*private TestAccessSpecifier() {
        System.out.println("Calling from Constructor");
    }*/
    
    private void message(){
        System.out.println("Message = "+data);
    }
    
}
