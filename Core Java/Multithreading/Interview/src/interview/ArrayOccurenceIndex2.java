
package interview;

import java.util.Collections;
import java.util.HashMap;

public class ArrayOccurenceIndex2 {
    public static void main(String[] args) {
        int arr [] = {1,2,6,7,3,4,3,5,5,8,4};
       
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    map.put(arr[i],i);
                }  
            }
        }
        
        int minKey = Collections.min(map.keySet());
        int index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if(minKey == arr[i]){
                index=i;
                break;
            }
        }
        
        System.out.println("Min Element = "+minKey);
        System.out.println("Index = "+index);
    }
}
