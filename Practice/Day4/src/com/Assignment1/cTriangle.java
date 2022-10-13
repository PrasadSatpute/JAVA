
package com.Assignment1;

import java.util.Scanner;

public class cTriangle implements iShape{
    int base;
    int height;
    
    Scanner sc = new Scanner(System.in);
    
    public void inputData(){
        System.out.println("Enter Base = ");
        base = sc.nextInt();
        System.out.println("Enter Height = ");
        height = sc.nextInt();
    }
    
    @Override
    public double findArea() {
        return (base * height)/2;
    }
    
    public void showData(){
        System.out.println("Base = "+base);
        System.out.println("Height = "+height);
        System.out.println("Area of Triangle = "+findArea());
        
    }
}
