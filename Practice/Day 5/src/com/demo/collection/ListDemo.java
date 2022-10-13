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
public class ListDemo {
    public static void main(String[] args) {
    List<String> flist=new ArrayList<>();
    List<Integer> ilist=new ArrayList<>();
    
    flist.add("ramesh");
    flist.add("prakash");
    flist.add("rahul");
    flist.add("hello");
    
        for (String sf : flist) {
            System.out.println(sf);
        }
    
    }
    
    
}
