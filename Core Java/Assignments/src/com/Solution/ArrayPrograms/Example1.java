
package com.Solution.ArrayPrograms;

import java.util.Collections;
import java.util.HashMap;

public class Example1 {
    public static void main(String[] args) {
        int arr [] = {1,4,2,6,8,8,4,6,3,5,9,9,6,7,5,3,7,8,5,9,9};
       
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    map.put(arr[i],i);
                }  
            }
        }
        
        int minKey = Collections.min(map.keySet());
        int index = 0;
        
        System.out.println("Min Element = "+minKey);
        
        for (int i = 0; i < arr.length; i++) {
            if(minKey == arr[i]){
                index=i;
                break;
            }
        }
        
        System.out.println("Index = "+index);
    }
}
