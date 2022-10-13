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
public class Teacher {
    private String name;
    private int age;
    private Address add;
    
    public void inputData()
            
    {   
        String add1,add2,add3;
        add=new Address();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name=");
        name=sc.next();
        System.out.print("Age=");
        age=sc.nextInt();
        System.out.println("Enter address line1");
        add1=sc.next();
        System.out.println("Enter address line2");
        add2=sc.next();
        System.out.println("Enter address line3");
        add3=sc.next();
        add.setAdd1(add1);
        add.setAdd2(add2);
        add.setAdd3(add3);
        
    }
    public void showData()
    {
        System.out.println("Name of teacher="+name);
        System.out.println("Age="+age);
        System.out.println("Address="+add.getAdd1()+"\n"+add.getAdd2()+"\n"+add.getAdd3());
    }
    public static void main(String []args)
    {
            Teacher t1=new Teacher();
            t1.inputData();
            t1.showData();
    }
}