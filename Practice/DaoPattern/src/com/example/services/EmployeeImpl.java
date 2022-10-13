/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.services;

import com.example.dao.EmployeeInterface;
import com.example.dto.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeImpl implements EmployeeInterface{

    public static Scanner sc = new Scanner(System.in);
    List<Employee> employee;
    int empSize;
    
    public EmployeeImpl() {
        employee = new ArrayList<>();
        empSize = employee.size();
    }

    @Override
    public boolean addEmployee() {
        Employee emp = new Employee();
        System.out.println("Enter Name = ");
        emp.seteName(sc.nextLine());
        System.out.println("Enter Gender = ");
        emp.seteGender(sc.nextLine());
        System.out.println("Enter Salary = ");
        emp.seteSalary(sc.nextDouble());
        employee.add(emp);
        if(employee.size() > empSize){
            empSize = employee.size();
            return true;
        }
        else{
            return false;    
        }
    }

    @Override
    public boolean deleteEmployee() {
        System.out.println("Enter Name To Delete = ");
        String deleteName = sc.nextLine();
        for (Employee allEmployee : getAllEmployees()) {
            if((allEmployee.geteName()).equals(deleteName)){
                employee.remove(allEmployee);
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean updateEmpoloyee() {
        System.out.println("Enter Name To Update = ");
        String updateName = sc.nextLine();
        for (Employee allEmployee : getAllEmployees()) {
            if((allEmployee.geteName()).equals(updateName)){
                System.out.println("Enter Name = ");
                allEmployee.seteName(sc.nextLine());
                System.out.println("Enter Gender = ");
                allEmployee.seteGender(sc.nextLine());
                System.out.println("Enter Salary = ");
                allEmployee.seteSalary(sc.nextDouble());
                    return true;
                }
                else{
                    return false;
                }
        }
        return false;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employee;
    }

    @Override
    public Employee getEmployees() {
        System.out.println("Enter Employee Name = ");
        String empName = sc.nextLine();
        for (Employee allEmployee : getAllEmployees()) {
            if((allEmployee.geteName()).equals(empName)){
                return allEmployee;
            }else{
                return null;
            }
        }
        return null;
    }
}
