/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.*;


public class ListExample4 {
    public static void main(String[] args) {
        Student s[] = new Student[3];
        s[0] = new Student(1, "AAA", 55.66);
        s[1] = new Student(2, "BBB", 55.66);
        s[2] = new Student(3, "CCC", 55.66);
        
        List<Student> StudentList = new ArrayList<Student>();
        
        for(Student stud:s)
        {
            StudentList.add(stud);
        }
        
        for(Student stud:StudentList)
        {
            System.out.println("Roll no."+stud.getRollno());
            System.out.println("Roll no."+stud.getName());
            System.out.println("Roll no."+stud.getPercentage());
        }
        
    }
}
