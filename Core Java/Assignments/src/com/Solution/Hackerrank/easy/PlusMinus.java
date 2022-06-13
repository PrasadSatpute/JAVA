
package com.Solution.Hackerrank.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        
        float positive = 0;
        float negative = 0; 
        float zero = 0;
        
        for (Integer integer : arr) {
            if(integer > 0){
                positive++;
            }
            if(integer < 0){
                negative++;
            }
            if(integer == 0){
                zero++;
            }
        }
        System.out.println(positive+" "+negative+" "+zero+" "+arr.size());
        float p = positive / arr.size();
        float n = negative / arr.size();
        float z = zero / arr.size();
        
        System.out.println(String.format("%.6f", p));
        System.out.println(n);
        System.out.println(z);
    }
    
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int lengthArray = sc.nextInt();
//        int arr[] = new int[lengthArray];
//        for (int i = 0; i < lengthArray; i++) {
//            arr[i] = sc.nextInt();
//        }

        int arr[] = {-4,3,-9,0,4,1};

        List<Integer> list = new ArrayList<>();
        
        for (int i : arr) {
            list.add(i);
        }
        
        plusMinus(list);
        
    }
}
