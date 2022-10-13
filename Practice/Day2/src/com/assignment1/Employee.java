/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment1;

public class Employee {
    
    /**
     * @return the empid
     */
    public int getEmpid() {
        return empid;
    }

    /**
     * @param empid the empid to set
     */
    public void setEmpid(int empid) {
        this.empid = empid;
    }

    /**
     * @return the empName
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * @param empName the empName to set
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * @return the empSalary
     */
    public double getEmpSalary() {
        return empSalary;
    }

    /**
     * @param empSalary the empSalary to set
     */
    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    /**
     * @return the empPost
     */
    public String getEmpPost() {
        return empPost;
    }

    /**
     * @param empPost the empPost to set
     */
    public void setEmpPost(String empPost) {
        this.empPost = empPost;
    }

    /**
     * @return the empDepartment
     */
    public String getEmpDepartment() {
        return empDepartment;
    }

    /**
     * @param empDepartment the empDepartment to set
     */
    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }
    private int empid;
    private String empName;
    private double empSalary;
    private String empPost;
    private String empDepartment;

    public Employee() {
        
        this(0,"",0,"","");
    
    }
    
    public Employee(int empid, String empName, double empSalary, String empPost, String empDepartment) {
        this.empid = empid;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empPost = empPost;
        this.empDepartment = empDepartment;
    }

    @Override
    public String toString() {
        return "Employee{" + "empid=" + empid + ", empName=" + empName + ", empSalary=" + empSalary + ", empPost=" + empPost + ", empDepartment=" + empDepartment + '}';
    }

    
    
}
