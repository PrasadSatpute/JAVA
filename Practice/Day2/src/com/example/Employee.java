/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author AVENGER'S
 */
public class Employee {
    private int Empid;
    private double Empsal;
    private String Empost;
    private Departement dept;

    public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int Empid) {
        this.Empid = Empid;
    }

    public double getEmpsal() {
        return Empsal;
    }

    public void setEmpsal(double Empsal) {
        this.Empsal = Empsal;
    }

    public String getEmpost() {
        return Empost;
    }

    public void setEmpost(String Empost) {
        this.Empost = Empost;
    }

    public Departement getDept() {
        return dept;
    }

    public void setDept(Departement dept) {
        this.dept = dept;
    }
    
}