package com.example;


public class staticExample2 {
    int count = 0;
    static int count1 = 0;
    public staticExample2() {
        count++;
        count1++;
        System.out.println("Counter = "+count);
        System.out.println("Static Counter = "+count1);
    }
    
    static{
        System.out.println("Im Stsic Block");
    }
    
    public static void mymethod(){
        System.out.println("Hi am calling from Static Method");
    }
    
    public static void main() {
        
    }
    
    public static void main(String[] args) {
        staticExample2.mymethod();
        staticExample2.count1=12;
        staticExample2 obj1 = new staticExample2();
        staticExample2 obj2 = new staticExample2();
        staticExample2 obj3 = new staticExample2();
    }
}
