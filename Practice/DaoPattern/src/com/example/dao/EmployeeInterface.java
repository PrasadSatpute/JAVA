/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.dto.Employee;
import java.util.List;

public interface EmployeeInterface {
    public boolean addEmployee();
    public boolean deleteEmployee();
    public boolean updateEmpoloyee();
    public List<Employee> getAllEmployees();
    public Employee getEmployees();
}
