package org.example.practice;

//Implement a custom functional interface and use it with a lambda expression.
public class Test6 {
    interface CustomInterface
    {
        void function(String s);
    }
    public static void main(String[] args) {
        CustomInterface customInterface = System.out::println;
        customInterface.function("Hi Custom Interface");
    }
}
