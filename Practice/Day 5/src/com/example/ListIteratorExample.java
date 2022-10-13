/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        
        List<String> friendlist = new ArrayList<String>();
        friendlist.add("One");
        friendlist.add("Two");
        friendlist.add("Three");
        friendlist.add("Four");
        
        ListIterator itr = friendlist.listIterator();
        //Traversing
        while (itr.hasNext()) {            
            System.out.println("Index = "+itr.nextIndex()+" Value = "+itr.next());
        }
        //Traversing in revers oder
        while(itr.hasPrevious()){
            System.out.println("Index = "+itr.previousIndex()+" Value = "+itr.previous());
        }
    }
}
