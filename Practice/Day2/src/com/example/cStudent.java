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
public class cStudent extends cPerson{
    private int rollno;
    private double percentage;

    public cStudent()
    {
        super();
        rollno=1;
        percentage=99.45;
    }

    public cStudent(int rollno, double percentage, String nam, int ag) {
        super(nam, ag);
        this.rollno = rollno;
        this.percentage = percentage;
    }
    
    
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    public void inputData()
    {
        super.inputData();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rollno");
        rollno=sc.nextInt();
        System.out.println("Enter percentage");
        percentage=sc.nextDouble();
    }
    public void showData()
    {
        super.showData();
        System.out.println("Rollno="+getRollno());
        System.out.println("Percentage="+getPercentage());
    }
}