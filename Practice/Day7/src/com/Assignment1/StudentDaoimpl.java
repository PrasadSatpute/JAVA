/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Assignment1;

import static com.Assignment1.DaoPatternDemo.sc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDaoimpl implements iStudentDao{

    Scanner sc = new Scanner(System.in);
    
    List<Student> students;

    public StudentDaoimpl(){
        students = new ArrayList<Student>();
        
    }
    
    @Override
    public List getAllStudents() {
        return students;
    }

    @Override
    public void addStudent() {
        
        System.out.println("Name = ");
        String name = sc.nextLine();
        System.out.println("Roll no. = ");
        int rollno = sc.nextInt();
        
        Student s = new Student(name, rollno);
        
        students.add(s);
        
    }

    @Override
    public void updateStudent() {
        System.out.println("Enter Roll no. To Update");
        System.out.println("Roll no. = ");
        int rollno = sc.nextInt();
        System.out.println("Enter Name : ");
        String sChangeName = sc.nextLine();
        
        students.get(rollno).setsName(sChangeName);
    }

    @Override
    public void deleteStudent() {
        
        System.out.println("Enter Roll no. To Delete");
        System.out.println("Roll no. = ");
        int rollno = sc.nextInt();
        students.remove(rollno);
        System.out.println("Student Deleted");
    }

    
    
}
