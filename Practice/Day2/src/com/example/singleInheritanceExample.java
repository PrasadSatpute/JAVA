/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author AVENGER'S
 */
public class singleInheritanceExample {
    public static void main(String []args)
    {
        cStudent s=new cStudent();
        cStudent s1=new cStudent(2,89.56,"bbb",35);
        cStudent s2=new cStudent();
        s2.inputData();
        s.showData();
        System.out.println("---------------");
        s1.showData();
        System.out.println("---------------");
        s2.showData();
    }
}