/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.dto;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private double percentage;

    public Student() {
        this("",0,0.0);
    }

    public Student(String name, int age, double percentage) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
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

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", percentage=" + percentage + '}';
    }
    
    public static Scanner sc = new Scanner(System.in);
    
    public void getData(){
        System.out.println("Enter Name : ");
        
        name = sc.nextLine();
        sc.nextLine();
        setName(name);
        System.out.println("Enter Age : ");
        setAge(sc.nextInt());
        System.out.println("Enter Percentage : ");
        setPercentage(sc.nextDouble());
    }
    
    public void showData()
    {
        System.out.println("Name = "+name+" Age = "+age+" Percentage = "+percentage);
    }
    
}
