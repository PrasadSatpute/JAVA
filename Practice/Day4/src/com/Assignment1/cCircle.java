
package com.Assignment1;

import java.util.Scanner;

public class cCircle implements iShape{
    static double PI = 3.14;
    int radius;
    
    Scanner sc = new Scanner(System.in);
    
    public void inputData(){
        System.out.println("Enter Radius = ");
        radius = sc.nextInt();
    }
    
    @Override
    public double findArea() {
        return PI * (radius * radius);
    }
    
    public void showData(){
        System.out.println("Radius = "+radius);
        System.out.println("Area of Circle = "+findArea());
        
    }

    
}
