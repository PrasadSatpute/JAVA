/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sims.beans;

public class Student {
    private int stdID;
    private String stdName;
    private int stdAge;
    private String stdAddress;

    public Student(int stdID, String stdName, int stdAge, String stdAddress) {
        this.stdID = stdID;
        this.stdName = stdName;
        this.stdAge = stdAge;
        this.stdAddress = stdAddress;
    }

    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdAge() {
        return stdAge;
    }

    public void setStdAge(int stdAge) {
        this.stdAge = stdAge;
    }

    public String getStdAddress() {
        return stdAddress;
    }

    public void setStdAddress(String stdAddress) {
        this.stdAddress = stdAddress;
    }

    @Override
    public String toString() {
        return "Student{" + "stdID=" + stdID + ", stdName=" + stdName + ", stdAge=" + stdAge + ", stdAddress=" + stdAddress + '}';
    }
    
    
}
