/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Mahesh
 */
public class ArraytoArrayList {
    public static void main(String[] args) {
        String [] arr={"sachin","rahul","sh"};
        System.out.println("Array Element"+Arrays.toString(arr));
        List<String> flist=new ArrayList<>();
        for (String f : arr) {
            flist.add(f);
        }
        System.out.println("from list");
        for (String f : flist) {
            System.out.println(""+f);
        }
        
        List<Integer> ilist=new ArrayList<>();
        ilist.add(20);
        ilist.add(30);
        ilist.add(40);
        ilist.add(50);
        Integer [] iarr=ilist.toArray(new Integer[ilist.size()]);
        
        for (Integer i : iarr) {
            System.out.println(i);
        }
        
    }
}
