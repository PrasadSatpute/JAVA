/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5;

import java.util.Scanner;

public class cTeacher extends cPerson{
    int teacherID;
    String subject;
    double salary;

    public cTeacher() {
        teacherID = 101;
        subject = "JAVA";
        salary = 50000;
    }

    public cTeacher(String Name, int Age ,int teacherID ,String subject ,double salary) {
        super(Name, Age);
        this.teacherID=teacherID;
        this.subject=subject;
        this.salary=salary;
    }
    

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    Scanner sc = new Scanner(System.in);
    
    public void inputData(){
        super.inputData();
        System.out.println("ID    :   ");
        setTeacherID(sc.nextInt());
        System.out.println("Subject :   ");
        setSubject(sc.nextLine());
        System.out.println("Salary  :   ");
        setSalary(sc.nextDouble());
    }

    public void showData() {
        super.showData();
        System.out.println("cTeacher ID = " + teacherID + ", Subject = " + subject + "Salary = " + salary);
    }

    
}
