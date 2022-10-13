
package com.Assignment1;

import java.util.Scanner;

public class cRectangle implements iShape{
    int lenght;
    int breadth;
    
    Scanner sc = new Scanner(System.in);
    
    public void inputData(){
        System.out.println("Enter Lenght = ");
        lenght = sc.nextInt();
        System.out.println("Enter Breadth = ");
        breadth = sc.nextInt();
    }
    
    @Override
    public double findArea() {
        return lenght * breadth;
    }
    
    public void showData(){
        System.out.println("Lenght = "+lenght);
        System.out.println("Breadth = "+breadth);
        System.out.println("Area of Rectangle = "+findArea());
        
    }

}
