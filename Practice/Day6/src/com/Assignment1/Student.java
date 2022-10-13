/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Assignment1;

import java.util.Scanner;

public class Student {
    
    public static Scanner sc = new Scanner(System.in);
    
    private String studentID;
    private int stdRollNo;
    private String stdName;
    private String className;
    private String div;

    public Student(String studentID, int stdRollNo, String stdName, String className, String div) {
        this.studentID = studentID;
        this.stdRollNo = stdRollNo;
        this.stdName = stdName;
        this.className = className;
        this.div = div;
    }

    Student() {
        
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getStdRollNo() {
        return stdRollNo;
    }

    public void setStdRollNo(int stdRollNo) {
        this.stdRollNo = stdRollNo;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }
    
    public void inputData(){
        System.out.println("Enter StdID : ");
        studentID=sc.nextLine();
        System.out.println("Enter RollNo : ");
        stdRollNo=sc.nextInt();
        System.out.println("Enter StdName : ");
        stdName=sc.nextLine();
        System.out.println("Enter ClassName : ");
        className=sc.nextLine();
        System.out.println("Enter Division : ");
        div=sc.nextLine();
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", stdRollNo=" + stdRollNo + ", stdName=" + stdName + ", className=" + className + ", div=" + div + '}';
    }
    
    public void showData(){
        toString();
    }
    
}
