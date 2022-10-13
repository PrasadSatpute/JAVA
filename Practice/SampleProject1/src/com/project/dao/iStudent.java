/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.dao;

import com.project.dto.Student;
import java.util.List;

public interface iStudent {
    public boolean addStudent();
    public boolean deleteStudent();
    public boolean updateStudent();
    public Student getStudent(String name);
    public List<Student> getAllStudent();
}
