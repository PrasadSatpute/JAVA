
package com.Solution.Hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComparetheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < 3 ; i++) {
            if(a.get(i) == b.get(i)){
                continue;
            }
            if(a.get(i) > b.get(i)){
                countA++;
            }
            if(a.get(i) < b.get(i)){
                countB++;
            }
        }
        result.add(countA);
        result.add(countB);
        return result;
    }
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a.add(sc.nextInt());
        }
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            b.add(sc.nextInt());
        }
        
        System.out.println(compareTriplets(a, b).toString());
    }
}
