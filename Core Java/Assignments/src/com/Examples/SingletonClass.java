
package com.Examples;

//  1   We have to create Static instance or object of the class
//  2   Don't allow user to create a Instance with defoult contructer
//  3   We have to create a method which sould be static which return the instance of this class

class SomeClass
{
    static SomeClass obj = new SomeClass(); //  1st

    private SomeClass() {                   //  2nd - make private constructer
    }
    public static  SomeClass getInstance(){
        return obj;
    }
}

public class SingletonClass {
    public static void main(String[] args) {
//        SomeClass  obj1 = new SomeClass();
        SomeClass  obj1 = SomeClass.getInstance();
    }
}
