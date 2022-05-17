
package com.Examples;

class Outer{
    
    void callOuter(){
        System.out.println("Call Outer Class Method Using Object");
    }
    
    static void callOuter1(){
        System.out.println("Call Outer Static Class Method Using ClassName");
    }
    
    class Inner{
        void callInner(){
            System.out.println("Call Inner Class Method");
        }
    }
    
    static class Inner1{
        void callInner(){
            System.out.println("Call Static Inner Class Method");
        }
    }
}


public class InnerClass {
    
    
    public static void main(String[] args) {
        Outer out = new Outer();
        out.callOuter();
        Outer.callOuter1();
        Outer.Inner in = out.new Inner();
        in.callInner();
        Outer.Inner1 in1 = new Outer.Inner1();
        in1.callInner();
    }
}
