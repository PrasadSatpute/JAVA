
package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayOccurenceIndex111 {
    public static void main(String[] args) {
        
        int arr [] = {1,2,6,7,3,4,3,5,5,8,4};
        
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        
        list.stream()
        .filter(i -> Collections.frequency(list, i) > 1 ) 
        .collect(Collectors.toSet())
        .forEach(System.out::print);
        
        
    }
}
