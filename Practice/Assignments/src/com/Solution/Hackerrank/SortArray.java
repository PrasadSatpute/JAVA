package com.Solution.Hackerrank;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = {5,4,25,8,7,1,3,5,44,6};
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
//        Arrays.sort(arr);
//        
//        for (int i : arr) {
//            System.out.print(i+" ");
//        }
//        
    }
}
