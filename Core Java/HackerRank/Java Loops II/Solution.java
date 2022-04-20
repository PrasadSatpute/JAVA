import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c = 1;
            int s = a + c*b;
            int sum = s;
            System.out.print(s+" ");
            for(int j=1; j<n; j++)
            {
                c = c * 2;
                sum = sum + c*b;
                //System.out.println(s+" + "+c+" * "+b+" = "+sum+" ");
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        in.close();
    }
}