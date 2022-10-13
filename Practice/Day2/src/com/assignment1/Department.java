/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment1;

public class Department {
    
    /**
     * @return the deptID
     */
    public int getDeptID() {
        return deptID;
    }

    /**
     * @param deptID the deptID to set
     */
    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    /**
     * @return the deptName
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName the deptName to set
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @return the deptLocation
     */
    public String getDeptLocation() {
        return deptLocation;
    }

    /**
     * @param deptLocation the deptLocation to set
     */
    public void setDeptLocation(String deptLocation) {
        this.deptLocation = deptLocation;
    }
    
    private int deptID;
    private String deptName;
    private String deptLocation;

    public Department() {
    
        this(0,"","");
        
    }

    public Department(int deptID, String deptName, String deptLocation) {
        this.deptID = deptID;
        this.deptName = deptName;
        this.deptLocation = deptLocation;
    }

    @Override
    public String toString() {
        return "Department{" + "deptID=" + deptID + ", deptName=" + deptName + ", deptLocation=" + deptLocation + '}';
    }

    
}
