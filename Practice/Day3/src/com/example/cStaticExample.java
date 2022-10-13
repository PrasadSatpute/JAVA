/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class cStaticExample {
    // 
    static String div = "Computer Scirnce";
    String name;
    private int rollno;

    public cStaticExample() {
        this.name = "ABC";
        this.rollno = 11;
    }
    
    
    public cStaticExample(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    
    
    
    public void displayInfo(){
        System.out.println("Name = "+name);
        System.out.println("Rollno = "+rollno);
        System.out.println("Div = "+div);
    }
    
    public static void main(String[] args) {
        
    }
}
