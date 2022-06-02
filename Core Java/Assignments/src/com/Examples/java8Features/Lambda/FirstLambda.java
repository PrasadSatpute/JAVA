
package com.Examples.java8Features.Lambda;

public class FirstLambda {
    public static void main(String[] args) {
        System.out.println("My System Starts ...");
        
//        MyInterface myInterImpl = new MyInterImpl();
//        myInterImpl.sayHello();
//        MyInterface i = new MyInterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("I am from My Interface Impl ");
//            }
//        };
//        i.sayHello();

// -------------------------------------------------------

//  Lambda Expression Work With Only Functionl Interface
//          MyInterface i = ()->{
//              System.out.println("This is First Lambda Expression");  
//          };
//          i.sayHello();

// -------------------------------------------------------

//Lambda Will Work When FunctionalInterface
//          SumInterface sumIntern = (a,b) -> a + b;
//          System.out.println(sumIntern.sum(4,5));

// -------------------------------------------------------

//In this Example we know the AnonymusClass Will work 
//but if we use Lambda Expreassion it will not work

//          SumInterface sum2 = new SumInterface() {
//            @Override
//            public int sum(int a, int b) {
//                return 2;
//            }
//
//            @Override
//            public int sum2(int a, int b, int c) {
//                return 0;
//            }
//        };
    }
}
