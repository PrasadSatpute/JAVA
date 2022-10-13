/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment3;

public class cTeacher{
    int teacherID;
    String Name;
    String Subject;

    public cTeacher() {
        this(101,"ABC","JAVA");
    }

    public cTeacher(int teacherID, String Name, String Subject) {
        this.teacherID = teacherID;
        this.Name = Name;
        this.Subject = Subject;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    @Override
    public String toString() {
        return "cTeacher{" + "teacherID=" + teacherID + ", Name=" + Name + ", Subject=" + Subject + '}';
    }
    
    
    public void showData(){
        System.out.println(toString());
    }
    
    
    
}
