package com.Solution.Hackerrank;

import java.util.Arrays;
import java.util.List;

public class StringArraySortByLength1 {
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
 
// Driver function
public static void main(String args[])
{
    String []arr = {".","..","ABC1", "A1","A2", "ABCDEF1", "AB1", "AB2", "ABC2"};
    int n = arr.length;

    
    // Function to perform sorting
    mySort(arr,n);

}
}
