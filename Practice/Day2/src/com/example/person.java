/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class person {
    private String name;           //data member1
    private int age;               //data member2
    //constructor
    public person()         //Non-parameterized constructor-Default constructor
    {
      
    }
    public person(person p) //copy constructor
    {
        this.name=p.name;
        this.age=p.age;
    }
    public person(String nam,int ag) //parameterized constructor
    {
        this.name=nam;
        this.age=ag;
    }
    
    //instance method  - input
    public void inputData()
    {
        //initialization of data member through method
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        name=sc.next();
        System.out.print("Enter your age:");
        age=sc.nextInt();
    }
    //instance method - output
    public void showData()
    {
        System.out.println("Name="+name);
        System.out.println("Age="+age);
    }
     //getter & setter methods
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}