/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.student;

public class TestStudent {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
        
        studentDao.addStudent();

      //print all students
      for (Student student : studentDao.getAllStudents()) {
         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getStdName() + " ]");
      }
    }
}
