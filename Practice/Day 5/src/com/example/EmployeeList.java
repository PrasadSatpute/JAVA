/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {
        Employee e[] = new Employee[3];
        e[0] = new Employee(101, "AAA", 50000);
        e[1] = new Employee(102, "BBB", 60000);
        e[2] = new Employee(103, "CCC", 70000);
        
        List<Employee> EmployeeList = new ArrayList<Employee>();
        
        for(Employee emp:e)
        {
            EmployeeList.add(emp);
        }
        
        for(Employee emp:EmployeeList)
        {
            System.out.println("Employee ID"+emp.getEmpID());
            System.out.println("Employee Name"+emp.getName());
            System.out.println("Employee Salary"+emp.getSalary());
        }
        
    }
}
