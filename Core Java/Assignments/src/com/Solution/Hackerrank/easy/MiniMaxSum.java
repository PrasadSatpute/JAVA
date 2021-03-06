
package com.Solution.Hackerrank.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        int min = 0;
        int max = 0;
        
        List<Integer> tempArr1 = arr;
        List<Integer> tempArr2 = arr;
        
        List<Integer> sortedList1 = tempArr1.stream().sorted().collect(Collectors.toList());
        List<Integer> sortedList2 = tempArr2.stream()
			.sorted(Comparator.reverseOrder())
			.collect(Collectors.toList());
        
        for (Integer integer : sortedList1) {
            if(Collections.max(arr) != integer){
                min = min + integer;
            }
        }
        
        for (Integer integer : sortedList2) {
            if(Collections.min(arr) != integer){
                min = min + integer;
            }
        }
        
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
