/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.test;

import com.example.dao.EmployeeInterface;
import com.example.dto.Employee;
import com.example.services.EmployeeImpl;
import static com.example.services.EmployeeImpl.sc;
import java.util.Scanner;

public class EmployeeTest {
    public static Scanner sc = new Scanner(System.in);
    public static int menu(){
        System.out.println("1. Add Employee");
        System.out.println("2. Delete Employee");
        System.out.println("3. Update Employee");
        System.out.println("4. All Employee");
        System.out.println("5. Get Employee");
        System.out.println("6. Exit");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        EmployeeInterface employee = new EmployeeImpl();
        
        int choice;
        boolean result;
        
        while ((choice = menu()) != 6  ) {            
            switch(choice){
                case 1:
                    result = employee.addEmployee();
                    if (result) {
                        System.out.println("Employee Added");
                    }else{
                        System.out.println("Not Added");
                    }
                    break;
                case 2:
                    result = employee.deleteEmployee();
                    if (result) {
                        System.out.println("Employee Deleted");
                    }else{
                        System.out.println("Not Deleted");
                    }
                    break;
                case 3:
                    result = employee.updateEmpoloyee();
                    if (result) {
                        System.out.println("Employee Updated");
                    }else{
                        System.out.println("Not Updated");
                    }
                    break;
                case 4:
                    for (Employee allEmployee : employee.getAllEmployees()) {
                        System.out.println("Name = "+allEmployee.geteName()+" Gender = "+allEmployee.geteGender()+" Salary = "+allEmployee.geteSalary());
                    }
                    break;
                case 5:
                    try {
                        Employee emp = employee.getEmployees();
                        System.out.println("Name = "+emp.geteName());
                        System.out.println("Gender = "+emp.geteGender());
                        System.out.println("Salary = "+emp.geteSalary());
                    } catch (Exception e) {
                        continue;
                    }
                    break;
            }
        }
    }
}
