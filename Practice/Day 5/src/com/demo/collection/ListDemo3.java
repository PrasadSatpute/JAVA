/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mahesh
 */
public class ListDemo3 {

    public static void main(String[] args) {
        String [] sarr={"rahul","sachin","mahi","ishan","mahesh","sujata","Mamta","diksha","gaurav","ishwar"};
        List<String> slist=new ArrayList<>();
        for (String s : sarr) {
            slist.add(s);
        }
        
        
        
    }
    
}
