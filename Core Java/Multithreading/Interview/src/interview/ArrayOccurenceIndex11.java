
package interview;

public class ArrayOccurenceIndex11 {
    public static void main(String[] args) {
        int arr [] = {1,2,6,7,3,4,3,5,5,8,4};
        
        int minElement = 0;
        int index = 0;
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    if(minElement != 0){
                        if(minElement > arr[i]){
                            minElement = arr[i];
                            index = i;
                        }
                    }
                    else
                    {
                        minElement = arr[i];
                        index = i;
                    }
                }  
            }
        }
        System.out.println("Min Element = "+minElement);
        System.out.println("Index = "+index);
    }
}
