/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Assignment1;

import java.awt.Choice;
import java.util.Scanner;

public class DaoPatternDemo {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static int menu(){
        System.out.println("0. Exit");
        System.out.println("1. Add Student");
        System.out.println("2. Show All Student");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        return sc.nextInt();
    }
    
    public static void main(String[] args) {
        iStudentDao studentdao = new StudentDaoimpl();
        
        int Choice;
        while ((Choice = menu()) != 0) {            
            switch(Choice)
            {
                case 1 :
                {
                    studentdao.addStudent();
                    break;
                }
                case 2 :
                {
                    for(Student student:studentdao.getAllStudents()){
                        System.out.println("Name : "+student.getsName()
                                +"Roll no. : "+student.getRollNo());
                    }
                    break;
                }
                case 3 :
                {
                    studentdao.updateStudent();
                }
                case 4 :
                {
                    studentdao.deleteStudent();
                }
            }
        }
    }
}
