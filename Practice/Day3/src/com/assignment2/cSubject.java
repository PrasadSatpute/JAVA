/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment2;

import java.util.Scanner;

public class cSubject {
    
    Scanner sc = new Scanner(System.in);
    
    String subjectID;
    String subjectName;

    public cSubject() {
    }

    public cSubject(String subjectID, String subjectName) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void inputData(){
        System.out.println("Subject ID : ");
        setSubjectID(sc.nextLine());
        
        System.out.println("Subject Name : ");
        setSubjectName(sc.nextLine());
        
        
    }
    
    public void showData(){
        System.out.println("Subject ID : "+getSubjectID());
        System.out.println("Subject Name : "+getSubjectName());
    }
    
    public static void main(String[] args) {
        cSubject subject1 = new cSubject();
        subject1.inputData();
        subject1.showData();
    }
    
}
