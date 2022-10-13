/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

/**
 *
 * @author AVENGER'S
 */
public class cPerson {
    private String name;
    private int age;

    public cPerson()
    {
        name="xyz";
        age=23;
    }
    public cPerson(String nam,int ag)
    {
        this.name=nam;
        this.age=ag;
    }
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
    
    public void inputData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        name=sc.next();
        System.out.print("Enter your age:");
        age=sc.nextInt();
    }
    public void showData()
    {
        System.out.println("Name="+name);
        System.out.println("Age="+age);
    }
    
}