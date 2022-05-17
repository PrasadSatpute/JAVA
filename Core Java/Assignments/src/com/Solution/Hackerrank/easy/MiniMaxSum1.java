
package com.Solution.Hackerrank.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MiniMaxSum1 {
    public static void miniMaxSum(List<Integer> arr) {
        
        List<Long> newList = new ArrayList<>();
        
        for (int i = 0; i < arr.size(); i++) {
            long add = 0;
            for (int j = 0; j < arr.size(); j++) {
                if(i != j){
                    add = add + arr.get(j);
                }
                
            }
                newList.add(add);
        }
        long min = Collections.min(newList);
        long max = Collections.max(newList);
        
        System.out.println(min + " " + max);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        miniMaxSum(arr);
        bufferedReader.close();
    }
}
