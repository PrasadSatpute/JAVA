/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.*;



public class ListExample3 {
    public static void main(String[] args) {
        String []fruits = {"Mango","Apple","Strawbery","Grapes"};
        List<String>fruitlist = new ArrayList<String>();
        for(String fruit:fruits)
        {
            fruitlist.add(fruit);
        }
        //printing List
        for(String fruit:fruitlist)
        {
            System.out.println(fruit);
        }
        
        String specificfruit;
        specificfruit=fruitlist.get(2);
        System.out.println("Third item"+specificfruit);
        
        //replacing
        fruitlist.set(1, "Pinapple");
        
        for(String fruit:fruitlist)
        {
            System.out.println(fruit);
        }
    }
}
