/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.*;

public class mapExample2 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        
        map.put(1, "AAA");
        map.put(2, "BBB");
        map.put(3, "CCC");
        
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
