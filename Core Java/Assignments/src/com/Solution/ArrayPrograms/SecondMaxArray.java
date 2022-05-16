
package com.Solution.ArrayPrograms;

class a{

    public a() {
        System.out.println("Call super class A");
    }
    
    public void ab() {
        System.out.println("Call super class AB");
    }
}

public class SecondMaxArray extends a{

    public SecondMaxArray() {
        super();
//        super.ab();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,25,8,7,1,3,5,44,6};
        SecondMaxArray s = new SecondMaxArray();
        int max = arr[0];
        int smax = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]> max){
                smax=max;
                max = arr[i];
            }
        }
        
        System.out.println("Second Max = "+smax);
    }
}
