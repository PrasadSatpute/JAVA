package com.Examples;

public class AnonymousClassVSLambdaExpression {

    public static void main(String[] args) {
        Runnable r1 = new Runnable() { // Anonymous class
            @Override
            public void run() {
                System.out.println("Using Anonymous class");
            }
        };
        Runnable r2 = () -> { // lambda expression
            System.out.println("Using Lambda Expression");
        };
        new Thread(r1).start();
        new Thread(r2).start();
        
        new Thread (() -> {System.out.println("Using Lambda Expression");}).start();
    }

}
