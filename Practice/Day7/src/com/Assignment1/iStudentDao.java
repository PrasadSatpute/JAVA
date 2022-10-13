/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Assignment1;

import java.util.*;

public interface iStudentDao {
    public List<Student> getAllStudents(); //List
    public void updateStudent();  //void
    public void deleteStudent();  //void
    public void addStudent();     //void
}
