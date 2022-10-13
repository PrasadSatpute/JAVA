/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("City","AAA");
        map.put("Username","BBB");
        map.put("Password","CCC");
        
        Set myset = map.entrySet();
        //traversing
        Iterator itr = myset.iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
        }
    }
}
