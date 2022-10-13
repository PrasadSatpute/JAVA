/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.dto;

public class Subject {
    int teacherID;
    String subjectName;
    String subjectDescription;

    public Subject() {
    }

    public Subject(int teacherID, String subjectName, String subjectDescription) {
        this.teacherID = teacherID;
        this.subjectName = subjectName;
        this.subjectDescription = subjectDescription;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }
    
    
    
}
