
package com.Solution.Hackerrank.prep.algo.warmup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr, int length) {
        int size = length;
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        int result = 0;
        for (int i = 0; i < length; i++) {
            firstDiagonal = firstDiagonal + (arr.get(i).get(--size));
        }
        for (int i = 0; i < length; i++) {
            secondDiagonal = secondDiagonal + (arr.get(i).get(size++));
        }
        
        System.out.println(firstDiagonal);
        System.out.println(secondDiagonal);
        
        if(firstDiagonal > secondDiagonal){
            result = firstDiagonal - secondDiagonal;
        }
        else
        {
            result = secondDiagonal - firstDiagonal;
        }
        
        return result;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int rowcolumn = sc.nextInt();
        
        List<List<Integer>> arr = new ArrayList<>();
        
        for (int i = 0; i < rowcolumn; i++) {
            for (int j = 0; j < rowcolumn; j++) {
                arr.add(new ArrayList<Integer>());
                arr.get(i).add(j, sc.nextInt());
            }
        }
        
        int result = diagonalDifference(arr,rowcolumn);
        System.out.println(result);
    }
}
