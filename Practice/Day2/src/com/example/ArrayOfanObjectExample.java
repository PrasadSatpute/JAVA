/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.Student;

public class ArrayOfanObjectExample {
    public static void main(String []args)
    {
        Student []s;
        s=new Student[5];
        s[0]=new Student(1,"aaa",56.34);
        s[1]=new Student(2,"bbb",66.24);
        s[2]=new Student(3,"ccc",86.44);
        s[3]=new Student(4,"ddd",36.41);
        s[4]=new Student(5,"eee",46.38);
        //listing of an array all elements
        for(int i=0;i<s.length;i++)
        {
            System.out.println("Record no "+(i+1));
            s[i].displayInfo();
            System.out.println("-----------------");
        }
    }
}