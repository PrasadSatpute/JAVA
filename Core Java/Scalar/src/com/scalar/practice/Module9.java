package com.scalar.practice;

import java.lang.*;
import java.util.*;

public class Module9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//creating a matrix  
		int original[][]={{1,3,4,8},{2,4,3,9},{3,4,5,7}};    
		    System.out.println(original.length);
		    System.out.println(original[0].length);
		//creating another matrix to store transpose of a matrix  
		int transpose[][]=new int[original.length][original[0].length];  //3 rows and 3 columns  
		    
		//Code to transpose a matrix  
		for(int i=0;i<3;i++)
		{    
			for(int j=0;j<3;j++)
			{    
				transpose[i][j]=original[j][i];  
			}    
		} 
	}
}