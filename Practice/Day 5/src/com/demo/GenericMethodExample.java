/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

/**
 *
 * @author Mahesh
 */
public class GenericMethodExample {
    /*
    public static void printArray(Integer [] intArray){
        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }
    
    public static void printArray(Double [] doubleArray){
        for(int i=0;i<doubleArray.length;i++){
            System.out.println(doubleArray[i]);
        }
    }
    
    public static void printArray(Character [] charArray){
        for(int i=0;i<charArray.length;i++){
            System.out.println(charArray[i]);
        }
    }
    */
    public static <E> void printArray(E[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        
        Integer [] intArray={10,20,3,40,50,60};
        Double [] doubleArray={10.55,12.66,52.33,55.66};
        Character [] chArray={'A','B','C','D'};
        
        GenericMethodExample.printArray(intArray);
        System.out.println("-------------------------------");
        GenericMethodExample.printArray(doubleArray);
        System.out.println("-------------------------------");
        GenericMethodExample.printArray(chArray);
        
    }
    
    
}
