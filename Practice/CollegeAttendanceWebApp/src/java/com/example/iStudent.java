/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.cStudent;
import java.util.List;

public interface iStudent {
    public void addStudent(String fname, String lname, String branch, String year, String contact, String address, String email);
    public boolean deleteStudent();
    public boolean updateStudent();
    public cStudent getStudent(String name);
    public List<cStudent> getAllStudent();
}
