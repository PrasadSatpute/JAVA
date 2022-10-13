/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.services;

import com.project.dao.iStudent;
import com.project.dto.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentImplement implements iStudent{
    
    static int studentCount;
    
    Student student;
    List<Student> studentList;

    public StudentImplement() {
        
        student = new Student();
        studentList = new ArrayList<>();
        studentCount = studentList.size();
    }
    

    @Override
    public boolean addStudent() {
        
        student.getData();
        studentList.add(student);
        
        if(studentList.size() == studentCount + 1)
        {
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean deleteStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getStudent(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getAllStudent() {
        return studentList;
    }
    
}
