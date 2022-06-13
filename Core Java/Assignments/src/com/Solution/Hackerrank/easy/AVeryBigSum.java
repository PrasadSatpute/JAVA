
package com.Solution.Hackerrank.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AVeryBigSum {
        public static long simpleArraySum(List<Long> ar) {
        long sum = 0;
        for(Long i : ar){
            sum = sum + i;
        }
        
        return sum;
    }
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int lengthOfArray = sc.nextInt();
        List<Long> ar = new ArrayList<>();
        for (int i = 0; i < lengthOfArray; i++) {
            ar.add(sc.nextLong());
        }
        
        System.out.println(simpleArraySum(ar));
        
    }
}
