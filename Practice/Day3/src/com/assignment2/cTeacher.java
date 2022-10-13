/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment2;

import java.util.Scanner;

public class cTeacher {
    
    Scanner sc = new Scanner(System.in);
    
   int teacherID;
   String teacherName;
   String subjectName;

    public cTeacher() {
    }

    public cTeacher(int teacherID, String teacherName, String subjectName) {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        this.subjectName = subjectName;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void inputData(){
        System.out.println("Teacher ID : ");
        setTeacherID(sc.nextInt());
        System.out.println("Teacher Name : ");
        setTeacherName(sc.nextLine());
        System.out.println("Subject Name : ");
        setSubjectName(sc.nextLine());
        
    }
    
    public void showData(){
        System.out.println("Teacher ID : "+getTeacherID());
        System.out.println("Teacher Name : "+getTeacherName());
        System.out.println("Subject : "+getSubjectName());
    }
    
    public static void main(String[] args) {
        cTeacher techer1 = new cTeacher();
        techer1.inputData();
        techer1.showData();
    }
   
}
