
package interview.arrayCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import jdk.nashorn.internal.ir.ContinueNode;

public class ArrayOccurenceIndex111 {
    public static void main(String[] args) {
        
//        Stream<Integer> number = Stream.of(1, 2, 3, 4, 5);
//
//        List<Integer> result2 = number.filter(x -> x != 3).collect(Collectors.toList());
//
//        result2.forEach(x -> System.out.println(x));
        
        int arr [] = {1,2,6,7,3,4,3,5,5,8,4};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        
        System.out.println(list);
        
        Stream<Integer> list1 = list.stream().filter(i -> Collections.frequency(list, i) > 1);
        list1.forEach(System.out::print);
        
        //Convert a Stream to List
//        List<Integer> list2 = list1.collect(Collectors.toList());
//        
//        int min = 0;
//        try {
//            min = Collections.min(list2);
//            
//        } catch (Exception e) {
//            System.out.println("Min Element = "+min);
//            for (int i = 0; i < arr.length; i++) {
//                if (min == arr[i]) {
//                    System.out.println("Min Element Index = "+i);
//                    break;
//                }
//            }
//        }
        
        list.stream()
        .filter(i -> Collections.frequency(list, i) > 1 && Collections.min(list) < i) 
        .collect(Collectors.toSet())
        .forEach(System.out::print);
    }
}
