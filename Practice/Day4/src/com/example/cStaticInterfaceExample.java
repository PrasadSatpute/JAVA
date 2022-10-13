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
public class cStaticInterfaceExample implements iFindOperation{
    
    public static void main(String[] args) {
        int number = 10;
        int result;
        System.out.println("Cube of number is="+iFindOperation.cube(number));
        System.out.println("Square of number is="+iFindOperation.square(number));
    }
}
