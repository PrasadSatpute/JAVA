/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.serve;
import com.project.dao.iStudent;
import com.project.dto.Student;
import com.project.services.StudentImplement;
import java.util.List;
import java.util.Scanner;

public class StudentMenu {
    
    public static Scanner sc = new Scanner(System.in);
    
    public int studentMenu(){
        
        System.out.println("0. Exit");
        System.out.println("1. Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Update Student");
        System.out.println("4. Show All Students");
        
        return sc.nextInt();
        
    }

    public StudentMenu() {
        
        
        iStudent student = new StudentImplement();
        
        int choice ;
        while((choice = studentMenu()) != 0)
        {
            switch(choice)
            {
                case 1:
                    System.out.println(student.addStudent());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    List<Student> stu = student.getAllStudent();
                    for(Student s:stu)
                    {
                        System.out.println("Name = "+s.getName()+" Age = "+s.getAge()+" Percentage = "+s.getPercentage());
                        
                    }
                    
                    break;
                default:
                    System.out.println("Please choose correct Option");
            }
        }
    }
    
    
}
