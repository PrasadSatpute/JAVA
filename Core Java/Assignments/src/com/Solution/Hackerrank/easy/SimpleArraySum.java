
package com.Solution.Hackerrank.easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleArraySum {
    
    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for(Integer i : ar){
            sum = sum + i;
        }
        return sum;
    }
    
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int lengthOfArray = sc.nextInt();
        List<Integer> ar = new ArrayList<>();
        for (int i = 0; i < lengthOfArray; i++) {
            ar.add(sc.nextInt());
        }

        
        
        System.out.println(simpleArraySum(ar));
        
    }
}
