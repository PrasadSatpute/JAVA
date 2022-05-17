
package com.Examples;

class Other{
    void call(){
        System.out.println("Other class Call");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Other o = new Other(){
            void call(){
                System.out.println("Anonymous Call");
            }
        };
        
        o.call();
    }
}
