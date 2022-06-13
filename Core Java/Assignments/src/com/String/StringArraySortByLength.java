package com.String;

import java.util.Arrays;
import java.util.List;

public class StringArraySortByLength {
    static void sort(String []s, int n)
{
    for (int i=1 ;i<n; i++)
    {
        String temp = s[i];
 
        // Insert s[j] at its correct position
        int j = i - 1;
        
        
        
        while (j >= 0 && temp.length() < s[j].length())
        {
            s[j+1] = s[j];
            j--;
        }
        s[j+1] = temp;
    }
}
    
    static void mySort(String []s, int n)
{
    String tempS[] = new String[n];
    int tempN[] = new int[n];
    
    for (int i=0 ;i<n; i++)
    {
        tempN[i] = s[i].length();
    }
    
    Arrays.sort(tempN);
    for (int i : tempN) {
        System.out.println("tempN = "+i);
    }
    
    for (int i=0 ;i<n; i++)
    {
        for(int j = 0; j<n; j++){
            
            if(tempN[i] == s[j].length())
            {
                
                tempS[i] = s[j];
                System.out.print(s[j]+" ");
                s[j] = "";
            }
        }
        
    }
}
 
// Function to print the sorted array of string
static void printArraystring(String str[], int n)
{
    for (int i=0; i<n; i++)
        System.out.print(str[i]+" ");
}
 
// Driver function
public static void main(String args[])
{
    String []arr = {".","..","ABC1", "A1","A2", "ABCDEF1", "AB1", "AB2", "ABC2"};
    int n = arr.length;
    
//    Arrays.sort(arr);
//    for (String string : arr) {
//        
//        System.out.print(string+" ");
//        
//    }
    
    // Function to perform sorting
    mySort(arr,n);
//    sort(arr,n);
    // Calling the function to print result
//    printArraystring(arr, n);
     
}
}
