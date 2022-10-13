/*
 * Author       : Prasad Satpute
 * Date         : 04/03/2022
 * Program      : Employee Data
 * Description  : 
 */
package com.assignment1;

import java.util.Scanner;


public class assignment1 {
    public static void main(String[] args) {
        EmployeeTest emptest = new EmployeeTest();
        DepartmentTest depttest = new DepartmentTest();
        
        Employee emp = new Employee();
        emptest.setEmp(emp);
        emptest.inputData();
        emptest.showData();
        
        Department dept = new Department();
        depttest.setDept(dept);
        depttest.inputData();
        depttest.showData();
        
        Employee emp1 = new Employee(101, "ABC", 0, "TL", "MANAGEMENT");
        emptest.setEmp(emp1);
        emptest.showData();
        
        Department dept1 = new Department(111, "TL", "MANAGEMENT");
        depttest.setDept(dept1);
        depttest.showData();
        
        
    }
}
