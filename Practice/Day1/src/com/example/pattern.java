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
public class pattern {
    
    public static void main(String[] args) {
        System.out.println("Pattern 1");
        
                for (int i = 1; i <= 5; i++) {

                    for (int j = 1; j <= i; j++) {
                        System.out.print(+j+" ");
                    }
                    System.out.println();
                }
    
        System.out.println("Pattern 2");
        
                for (int i = 4; i >= 0; i--)
                {
                    int alphabet = 65;
                    for (int j = 0; j <= i; j++)
                    {
                        System.out.print((char) (alphabet + j) + " ");
                    }
                    System.out.println();
                }
                
        System.out.println("Pattern 3");
                int number = 1;
                for (int i = 1; i <= 5; i++) {

                    for (int j = 1; j <= i; j++) {
                        System.out.print(+number+" ");
                        if(number == 9){
                            number = 0;
                        }else{
                            number++;
                        }

                    }
                    System.out.println();
                }
    }
    
}
