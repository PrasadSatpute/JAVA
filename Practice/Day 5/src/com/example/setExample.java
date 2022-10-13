/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.*;

public class setExample {
    public static void main(String[] args) {
        int []intarray = {24,73,12,57,12};
        Set<Integer> intset = new HashSet<>();
        for(int i=0;i<intarray.length;i++){
            intset.add(intarray[i]);
        }
        System.out.println(intset);
        TreeSet sortedset =new TreeSet<Integer>(intset);
        System.out.println(sortedset);
        System.out.println("First"+sortedset.first());
        System.out.println("Last"+sortedset.last());
    }
}
