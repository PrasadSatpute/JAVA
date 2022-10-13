/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.*;

public class mapExample4 {
    public static void main(String []args)
    {
        Map<Integer,Book> map=new HashMap<Integer,Book>();
        Book b1=new Book(1234,"Let us C","Yashwant Kanetkar");
        Book b2=new Book(2342,"Masterin Java","Balguruswami");
        map.put(1, b1);
        map.put(2, b2);
        //Traversing map  
    for(Map.Entry<Integer, Book> entry:map.entrySet()){    
       // int key=entry.getKey();  
        Book b=entry.getValue();  
        //System.out.println(key+" Details:");  
        System.out.println(b.getISBN()+" "+b.getBookname()+" "+b.getAuthor());   
    }    

    }
}
