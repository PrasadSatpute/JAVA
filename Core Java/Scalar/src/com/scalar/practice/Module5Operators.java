package com.scalar.practice;

import java.lang.*;
import java.util.*;

public class Module5Operators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		        

		        int n1 = scan.nextInt();
		        int n2 = scan.nextInt();
		        int n3 = scan.nextInt();

		        if(n1 >= 0 && n1 <= 10000000 && n2 >= 0 && n2 <= 10000000)
		        {
		            if(n3 >= 1 && n3 <= 10000000)
		            {
		                int n4 = n1 + n2;
		                System.out.println(n4 % n3);
		            }
		        }
		
		        
		        System.out.println("--------------------------------------------------------------------------------------");

		

		        int A = scan.nextInt();
		        int B = scan.nextInt();
		        int C = scan.nextInt();

		        if(A >= 1 && A <= 100000 && B >= 1 && B <= 100000 && C >= 1 && C <= 100000)
		        {
		            if(A == B && B == C && C == A)
		            {
		                System.out.println("equilateral");
		            }
		            else
		            {
		                if((A == B && C < A) || (A == C && B < C) || (B == C && A < B))
		                {
		                    System.out.println("isosceles");
		                }
		                else
		                {
		                    System.out.println("scalene");
		                }
		            }
		        }
		        
		        
		        System.out.println("--------------------------------------------------------------------------------------");
		        
		        int N = scan.nextInt();
		        if(N >= 1 && N <= 1000)
		        {
		            int Sum = 0;
		            for(int i = 1; i <= N; i++)
		            {
		                Sum = Sum + i;
		            }

		            System.out.println(Sum);
		        }
		        
		        System.out.println("--------------------------------------------------------------------------------------");
		        
		        
		        
		        
		    }
}