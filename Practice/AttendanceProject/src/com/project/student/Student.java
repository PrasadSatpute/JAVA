/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.student;

import java.util.Scanner;

public class Student {
    private int rollNo;
    private String stdName;
    private String stdGender;
    private String stdAddress;

    public Student() {
    }

    public Student(int rollNo, String stdName, String stdGender, String stdAddress) {
        this.rollNo = rollNo;
        this.stdName = stdName;
        this.stdGender = stdGender;
        this.stdAddress = stdAddress;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdGender() {
        return stdGender;
    }

    public void setStdGender(String stdGender) {
        this.stdGender = stdGender;
    }

    public String getStdAddress() {
        return stdAddress;
    }

    public void setStdAddress(String stdAddress) {
        this.stdAddress = stdAddress;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", stdName=" + stdName + ", stdGender=" + stdGender + ", stdAddress=" + stdAddress + '}';
    }
    
    public static Scanner sc = new Scanner(System.in);
    
    public void inputData(){
        
        System.out.println("Enter RollNo. : ");
        rollNo = sc.nextInt();
        System.out.println("Enter Name : ");
        stdName = sc.nextLine();
        System.out.println("Enter Gender : ");
        stdGender=sc.nextLine();
        System.out.println("Enter Address : ");
        stdAddress=sc.nextLine();
        
        
    }
    
    public void showData(){
        System.out.println(
                "\nRollNo = "+rollNo+
                        "\nName = "+stdName+"\nGender = "+stdGender+
                        "\nAddress = "+stdAddress);
    }
}
