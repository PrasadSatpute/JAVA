/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class Student {
    private int rollno;
    private String name;
    private double percentage;
    
    public Student()
    {
        this.rollno=1;
        this.name="aaa";
        this.percentage=99.99;
    }
    public Student(int rn,String nam,double per)
    {
        this.rollno=rn;
        this.name=nam;
        this.percentage=per;
    }
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    public void displayInfo()
    {
        System.out.println("Rollno="+getRollno());
        System.out.println("Name="+getName());
        System.out.println("Percentage="+getPercentage());
    }
    
    
    
}
