/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment2;

import java.util.Scanner;

public class cStudent {
    
    Scanner sc = new Scanner(System.in);
    
   int StudentID;
   int Rollno;
   String Name;
   String classname; 
   String Div;
   cSubject sub;

    public cStudent() {
    }

   
   
    public cStudent(int StudentID, int Rollno, String Name, String classname, String Div, cSubject sub) {
        this.StudentID = StudentID;
        this.Rollno = Rollno;
        this.Name = Name;
        this.classname = classname;
        this.Div = Div;
        this.sub = sub;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
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

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getDiv() {
        return Div;
    }

    public void setDiv(String Div) {
        this.Div = Div;
    }

   
    public void inputData(){
        System.out.println("Enter ID : ");
        setStudentID(sc.nextInt());
        System.out.println("Enter RollNo. : ");
        setRollno(sc.nextInt());
        System.out.println("Enter Name : ");
        setName(sc.nextLine());
        System.out.println("Enter ClassName : ");
        classname=sc.nextLine();
        System.out.println("Enter Div : ");
        Div=sc.nextLine();
        System.out.println("Subject : ");
        System.out.println("SubjectID : ");
        sub.subjectID=sc.nextLine();
        System.out.println("Subject Name : ");
        sub.subjectName=sc.nextLine();
        
    }
    
    public void showData(){
        System.out.println(
                "ID="+StudentID+"\nRollNo="+Rollno+
                        "\nName="+Name+"\nClassName="+classname+
                        "\nDiv="+Div);
        System.out.println("Subject : ");
        System.out.println("Subject ID : "+sub.getSubjectID());
        System.out.println("Subject Name : "+sub.getSubjectName());
    }
    
    public static void main(String[] args) {
        cStudent student1 = new cStudent();
        student1.inputData();
        student1.showData();
    }
    
}
