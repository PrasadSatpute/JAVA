/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class loopStatement {
   public static void doWhileLoop()
   {
       int i=11;
       do
       {
         System.out.println(i);
         i++;
       }while(i<=10);
   }
   public static void whileLoop_asending()
    {
       int i=1;
            while(i<=10)        //finte loop
            {
                System.out.println(i);
                i++;
            } 
    }
    public static void whileLoop_desending()
    {
        int i=10;
            while(i>=1)        //finte loop
            {
                System.out.println(i);
                i--;
            }
    }
    public static void forLoop1()
    {   int i=1;
        for(;i<=10;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String []args)
    {
            //whileLoop_asending();
            //System.out.println("---------");
            //whileLoop_desending();
            //System.out.println("---------");
            //forLoop1();
            doWhileLoop();
    }
    
}