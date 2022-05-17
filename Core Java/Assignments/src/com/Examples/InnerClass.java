
package com.Examples;

class Outer{
    
    void callOuter(){
        System.out.println("Call Outer Class");
    }
    
    class Inner{
        void callInner(){
            System.out.println("Call Inner Class");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.callOuter();
        Outer.Inner in = out.new Inner();
        in.callInner();
    }
}
