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
import java.math.*;

public class methodOverloadingExample {
    //method overloading
    public static void method()
    {
        System.out.println("Method calling without parameter");
    }
    public static void method(int x, int y)
    {
        System.out.println("This method is taking integer number");
    }
    public static void method(int x, int y, int z)
    {
        System.out.println("I am handing 3 integer parameters");
    }
      public static void method(double x, double y, double z)
    {
        System.out.println("I am handing 3 real parameters");
    }
    public static void method(float x, float y)
    {
        System.out.println("This method is taking real number");
    }
    
   public static void main(String []args)
   {
       method();                //without parameter
       method(12,33);           //integer parameter method getting called
       method(12.34f,101.45f);  //real number parameters method is getting called
       method(12,13,45);        //
       method(12.34f,12.45f,24.55f);
      
   }
}