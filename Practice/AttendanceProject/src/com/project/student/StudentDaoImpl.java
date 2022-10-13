/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AVENGER'S
 */
public class StudentDaoImpl implements StudentDao{
    
    //list is working as a database
   List<Student> students;
   String line = "";
    String splitBy = ",";
    BufferedReader br;

   public StudentDaoImpl(){
       try {
           this.br = new BufferedReader(new FileReader("C:\\Users\\AVENGER'S\\Documents\\NetBeansProjects\\AttendanceProject\\src\\com\\project\\Students.csv"));
       } catch (FileNotFoundException ex) {
           Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
       }
      students = new ArrayList<Student>();
   }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public void addStudent() {
        Student s = new Student();
        s.inputData();
        students.add(s);
    }

    @Override
    public Student getStudent(int rollNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
