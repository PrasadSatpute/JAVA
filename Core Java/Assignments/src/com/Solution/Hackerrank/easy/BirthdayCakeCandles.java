
package com.Solution.Hackerrank.easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = Collections.max(candles);
        int count = 0;
        for (int i = 0; i < candles.size(); i++) {
            if(max == candles.get(i)){
                count++;
            }
        }
        
        return count;
    }
    public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        
        int result = birthdayCakeCandles(candles);
        
        System.out.println(result);
        
        bufferedReader.close();


    }
}
