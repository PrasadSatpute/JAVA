/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.subject;

public class Subject {
    private String subCode;
    private String TeacherID;
    private String Description;

    public Subject() {
    }

    
    
    public Subject(String subCode, String TeacherID, String Description) {
        this.subCode = subCode;
        this.TeacherID = TeacherID;
        this.Description = Description;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getTeacherID() {
        return TeacherID;
    }

    public void setTeacherID(String TeacherID) {
        this.TeacherID = TeacherID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "Subject{" + "subCode=" + subCode + ", TeacherID=" + TeacherID + ", Description=" + Description + '}';
    }
    
}
