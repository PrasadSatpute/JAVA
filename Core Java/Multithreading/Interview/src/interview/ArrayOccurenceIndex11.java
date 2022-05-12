
package interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayOccurenceIndex11 {
    public static void main(String[] args) {
        int arr [] = {1,2,6,7,3,4,3,5,5,8,4};
        
        
       
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        int minEle = 0;
        int indexMin = 0;
        
        for (int i : arr) {
            map.put(i,);
            if(Collections.min(map) == i){
                minEle = i;
                indexMin = i.
            }
        }
        
        for (Integer integer : map) {
            
        }
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    map.add(arr[i]);
                }  
            }
        }
        
        int minElement = Collections.min(map);
        int index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if(minElement == arr[i]){
                index=i;
                break;
            }
        }
        
        System.out.println("Min Element = "+minElement);
        System.out.println("Index = "+index);
    }
}
