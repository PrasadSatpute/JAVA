
package com.String;

public class ReversofString {
    public static void main(String[] args) {
        String str = "1 2 3 4 5 6 7 8 9 10";
        
        char[] revString = new char[str.length()];
        
        System.out.println("Original String = "+str.toString());
        
        int j = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            revString[j] = str.charAt(i);
            j++;
        }
        
        System.out.println("Revers String = "+String.valueOf(revString));
    }
}
