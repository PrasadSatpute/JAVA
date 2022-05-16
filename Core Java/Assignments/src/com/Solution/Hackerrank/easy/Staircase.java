
package com.Solution.Hackerrank.easy;

import java.util.Scanner;

public class Staircase {
    
    public static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = (n-i)-1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 0; k--) {
                System.out.print("#");
            }
            System.out.println("");
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        staircase(n);
        
    }
}