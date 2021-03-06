
package interview.arrayCollection;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayOccurenceIndex1 {
    public static void main(String[] args) {
        int arr [] = {1,2,6,7,3,4,3,5,5,8,4};
       
        HashSet<Integer> map = new HashSet<>();
        //Loop For Collect REpeting Element
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    map.add(arr[i]);
                }  
            }
        }
        
        int minElement = Collections.min(map);
        int maxElement = Collections.max(map);
        int minIndex = 0;
        int maxIndex = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if(minElement == arr[i]){
                minIndex=i;
                break;
            }
        }
        
        System.out.println("Min Element = "+minElement);
        System.out.println("Index = "+minIndex);
        
        
        for (int i = 0; i < arr.length; i++) {
            if(maxElement == arr[i]){
                maxIndex=i;
                break;
            }
        }
        
        System.out.println("Max Element = "+maxElement);
        System.out.println("Index = "+maxIndex);
    }
}
