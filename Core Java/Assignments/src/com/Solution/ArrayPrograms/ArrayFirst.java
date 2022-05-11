
package com.Solution.ArrayPrograms;

public class ArrayFirst {
    
    static void occurence(int arr[], int n){
        int index=0;
        
        for(int i=0; i<arr.length; i++){
        if(arr[i] == n){
            index = i;
            break;
            }
        }
        System.out.println("First Occurence Index is = "+index);
    }
    
    public static void main(String[] args) {
        
        
        
    int arr[] = {1,2,3,3,5,5,5,5,4,8,6,2};
    
        occurence(arr, 5);
    
    }
}
