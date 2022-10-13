/*
 * Author       : Prasad Satpute
 * Date         : 04/03/2022
 * Program      : Geometric Figure
 * Description  : 
 */
package com.assignment2;

class cArea{
    int sSide = 10;
    public void square(){
        System.out.println("Area of the Square: "+ sSide * sSide);
    }
    public  void square(int sSide){
        System.out.println("Area of the Square: "+ sSide * sSide);
    }
    public  void square(double sSide){
        System.out.println("Area of the Square: "+ sSide * sSide);
    }
    
    int rSide1 = 10;
    int rSide2 = 20;
    
    public void Rectangle(){
        System.out.println("Area of the rectangle: " + rSide1 * rSide2);
    }
    public void Rectangle(int rSide1,int rSide2){
        System.out.println("Area of the rectangle: " + rSide1 * rSide2);
    }
    public void Rectangle(double rSide1,double rSide2){
        System.out.println("Area of the rectangle: " + rSide1 * rSide2);
    }
    
    //Area = Square root of√s(s - a)(s - b)(s - c)
    
    int aSide1 = 11;
    int aSide2 = 56;
    int aSide3 = 65;
    double s = ( aSide1 + aSide2 + aSide3 ) / 2 ;
    
    public void Triangle(){
        double AreaTriangle = Math.sqrt( s * (s-aSide1) * (s-aSide2) * (s-aSide3));
        System.out.println("Area of the Triangle: "+AreaTriangle);
    }
    public void Triangle(int aSide1 ,int aSide2 ,int aSide3){
        double AreaTriangle = Math.sqrt( s * (s-aSide1) * (s-aSide2) * (s-aSide3));
        System.out.println("Area of the Triangle: "+AreaTriangle);
    }
    public void Triangle(double aSide1 ,double aSide2 ,double aSide3){
        double AreaTriangle = Math.sqrt( s * (s-aSide1) * (s-aSide2) * (s-aSide3));
        System.out.println("Area of the Triangle: "+AreaTriangle);
    }
}

public class assignment2 {
    
    public static void main(String[] args) {
    
        cArea c = new cArea();
    
    c.square();
    c.square(20);
    c.square(21.2);
    
    System.out.println("------------------------");
    
    c.Rectangle();
    c.Rectangle(55, 66);
    c.Rectangle(25.3, 45.2);
    
    System.out.println("------------------------");
    
    c.Triangle();
    c.Triangle(10, 20, 10);
    c.Triangle(22.3, 28.5, 47.9);
    }
}
