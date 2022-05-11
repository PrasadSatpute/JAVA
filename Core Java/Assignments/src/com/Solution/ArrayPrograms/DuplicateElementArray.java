
package com.Solution.ArrayPrograms;

public class DuplicateElementArray {
    public static void main(String[] args) {
         //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
        System.out.println("Duplicate elements in given array: ");
        int count = 0;
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]){  
                    System.out.println(arr[j]);
                    count++;
                }
            }  
        }
        int reptArray[] = new int[count];
        
        count = 0;
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]) {
                    reptArray[count] = arr[j];
                    count++;
                } 
                    
            }  
        }
        
        for (int i = 0; i < reptArray.length; i++) {
            System.out.print(reptArray[i]+" ");
        }
        
        int min = reptArray[0];
        
        for (int i = 0; i < reptArray.length; i++) {
            if(min>reptArray[i])
            {
                min = reptArray[i];
            }
        }
        
        System.out.println("\nMin Element is = "+min);
        
    }  
}
