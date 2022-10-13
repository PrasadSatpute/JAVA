/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class nestedLoopExample {
    public static void main(String []args)
   {
       //outer loop
       for(int i=65;i<=69;i++)
       {
           //inner loop
           for(int j=65;j<=i;j++)
           {
              System.out.print((char)j+" ");
           }
           System.out.println();
       }
   }
}
