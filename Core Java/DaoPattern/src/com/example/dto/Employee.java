/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dto;
public class Employee {
    private String eName;
    private String eGender;
    private double eSalary;

    public Employee() {
        
    }

    public Employee(String eName, String eGender, double eSalary) {
        this.eName = eName;
        this.eGender = eGender;
        this.eSalary = eSalary;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteGender() {
        return eGender;
    }

    public void seteGender(String eGender) {
        this.eGender = eGender;
    }

    public double geteSalary() {
        return eSalary;
    }

    public void seteSalary(double eSalary) {
        this.eSalary = eSalary;
    }
}
