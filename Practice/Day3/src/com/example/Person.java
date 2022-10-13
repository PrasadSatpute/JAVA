/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "ABC";
        this.age = 21;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public static void main(String[] args) {
        Person p1 = new Person("XYZ",23);
        Person p2 = new Person("ASD", 22);
        System.out.println(p1);
        System.out.println(p2);
    }
}
