/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Assignment1;

import java.util.*;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestStudent {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static int menu(){
        System.out.println("0. Exit");
        System.out.println("1. Add Student");
        System.out.println("2. Show Student");
        System.out.println("3. Search Record");
        System.out.println("4. Save File in Data.csv");
        System.out.println("5. Split Files");
        return sc.nextInt();
    }
    
    public static void main(String[] args) throws IOException {
        List<Student> StudentList = new ArrayList<Student>();
        
        File file = new File("Data.csv");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
        } catch (IOException ex) {
            Logger.getLogger(TestStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        
        int choice;
        while ((choice = menu()) != 0) {            
            switch(choice)
            {
                case 1 :
                {
                    Student s = new Student();
                    s.inputData();
                    StudentList.add(s);
                    break;
                }
                case 2 :
                {
                    for(Student stud:StudentList)
                    {
                        System.out.println(stud.getStudentID());
                    }
                    break;
                }
                case 3 :
                {
                    System.out.println("Enter sudent ID : ");
                    String id = sc.nextLine();
                    StudentList.stream()
                        .filter(s -> s.getStudentID() == id)
                        .map(sm -> sm.getStdName()+" "+sm.getClassName())
                        .forEach(System.out::println);
                    
                    break;
                }
                case 4 :
                {
                    for(Student stud:StudentList)
                    {
                        bw.write(stud.getStudentID()
                                +" "+stud.getStdRollNo()
                                +" "+stud.getStdName()
                                +" "+stud.getClassName()
                                +" "+stud.getDiv());
                        bw.newLine();
                    }
                }
                case 5:
                {
                    break;
                }
                default:
                {
                    System.out.println("Please Enter Valid Choice");
                }
            }
        }
        
    }
}
