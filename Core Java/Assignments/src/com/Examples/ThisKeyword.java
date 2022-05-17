
package com.Examples;

class Add{
    private int a;
    private int b;
    private int c;

    Add(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    void show(){
        System.out.println("a = "+a+" b = "+b+" c = "+(a+b));
    }
    
}

public class ThisKeyword {
    public static void main(String[] args) {
        Add a = new Add(1,2);
        a.show();
    }
}
