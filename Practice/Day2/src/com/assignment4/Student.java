/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment4;

import java.util.Scanner;

public class Student {
    
    private int Rollno;
    private String Name;
    private double Percentage;

    public Student() {
        this(0,"",0.0);
    }

    public Student(int Rollno, String Name, double Percentage) {
        this.Rollno = Rollno;
        this.Name = Name;
        this.Percentage = Percentage;
    }
    
    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int Rollno) {
        this.Rollno = Rollno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getPercentage() {
        return Percentage;
    }

    public void setPercentage(double Percentage) {
        this.Percentage = Percentage;
    }

    @Override
    public String toString() {
        return "Student{" + "Rollno=" + Rollno + ", Name=" + Name + ", Percentage=" + Percentage + '}';
    }
    
    private static Scanner sc = new Scanner(System.in);
    
    public void acceptRecord( ) {
	
	System.out.print("Name	:	");
        sc.nextLine();
	setName(sc.nextLine());
	System.out.print("Roll no.	:	");
	setRollno(sc.nextInt());
	System.out.print("Parcentage	:	");
	setPercentage(sc.nextDouble());
        System.out.println("------------------------");
    }
    public void printRecord( ) {
	
	System.out.println(toString());
        System.out.println("------------------------");
    }
    
    
}
