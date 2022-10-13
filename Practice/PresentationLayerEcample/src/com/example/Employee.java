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
    private int empID;
    private String name;
    private double Salary;
    private String post;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    

    
    public String displayInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("EMP ID : "+getEmpID()+"\n");
        sb.append("Name : "+getName()+"\n");
        sb.append("Salary : "+getSalary()+"\n");
        sb.append("Post : "+getPost());
        return sb.toString();
    }
}
