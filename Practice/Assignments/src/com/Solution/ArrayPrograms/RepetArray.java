
package com.Solution.ArrayPrograms;

public class RepetArray {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 10, 1, 2, 3, 4, 2, 7, 8, 7, 8, 8, 3};
        
        System.out.println("All Repeted Element");
        
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] != 0){
                    if(arr[i] == arr[j]){  
                        System.out.print(arr[j]+" ");
                        arr[j] = 0;
                    }
                }
            }  
        }
        
        System.out.println("\n---------------------------------");
        
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
        System.out.println("\n---------------------------------");
        
        int count = 0;
        
        for (int i : arr) {
            if(i != 0){
                count++;
            }
        }
        
        int newArray[] = new int[count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                newArray[count] = arr[i];
                count++;
            }
        }
        
        for (int i : newArray) {
            System.out.print(i+" ");
        }
        
        System.out.println("\n---------------------------------");
        
        int min = newArray[0];
        int max = newArray[1];
        
        for (int i : newArray) {
            if(min>i){
                min = i;
            }
            if(max<i){
                max = i;
            }
        }
        
        System.out.println("Min Element is = "+min);
        System.out.println("Max Element is = "+max);
        
    }
}
