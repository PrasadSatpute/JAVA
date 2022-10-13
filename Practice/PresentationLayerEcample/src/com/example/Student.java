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
    
    public String displayInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("Roll No. : "+getRollno()+"\n");
        sb.append("Name : "+getName()+"\n");
        sb.append("Percentage : "+getPercentage());
        return sb.toString();
    }
}
